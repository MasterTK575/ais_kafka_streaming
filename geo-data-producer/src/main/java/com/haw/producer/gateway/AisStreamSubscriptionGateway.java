package com.haw.producer.gateway;

import com.haw.producer.ais.client.AisStreamClient;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.openapitools.client.custom.SubscriptionAction;
import org.openapitools.client.model.SubscriptionMessage;

import java.net.URISyntaxException;

@ApplicationScoped
@RequiredArgsConstructor
public class AisStreamSubscriptionGateway {

    @ConfigProperty(name = "AIS_STREAMS_API_KEY")
    String apiKey;

    private final AisStreamClient aisStreamClient;

    @Incoming("ais-subscriptions")
    public void handleAisSubscriptionAction(SubscriptionAction subscriptionAction) throws URISyntaxException {
        Log.info(String.format("Received subscription action: %s", subscriptionAction));
        if (subscriptionAction.isCloseConnection()) {
            this.aisStreamClient.closeConnection();
            return;
        }

        if (subscriptionAction.getBoundingBoxes().isEmpty()) {
            Log.info(String.format("No bounding boxes provided, skipping SubscriptionAction: %s", subscriptionAction));
            return;
        }

        this.aisStreamClient.connectToOrUpdateAisStream(new SubscriptionMessage()
                .apIKey(apiKey)
                .boundingBoxes(subscriptionAction.getBoundingBoxes())
                .filtersShipMMSI(subscriptionAction.getFiltersShipMMSI())
                .filterMessageTypes(subscriptionAction.getFilterMessageTypes()));
    }
}
