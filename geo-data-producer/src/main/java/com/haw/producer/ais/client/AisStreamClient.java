package com.haw.producer.ais.client;

import com.haw.producer.ais.handler.AisStreamHandler;
import com.haw.producer.ais.websocket.AisStreamWebsocketClient;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.openapitools.client.model.SubscriptionMessage;

import java.net.URI;
import java.net.URISyntaxException;

@ApplicationScoped
@RequiredArgsConstructor
public class AisStreamClient {

    @ConfigProperty(name = "ais.streams.api.uri")
    String aisStreamsApiUri;

    private final AisStreamHandler aisStreamHandler;
    private AisStreamWebsocketClient aisStreamWebsocketClient;

    public void connectToOrUpdateAisStream(SubscriptionMessage subscriptionMessage) throws URISyntaxException {
        if (this.aisStreamWebsocketClient != null) {
            this.aisStreamWebsocketClient.updateSubscription(subscriptionMessage);
            return;
        }

        this.aisStreamWebsocketClient = new AisStreamWebsocketClient(
                new URI(this.aisStreamsApiUri), subscriptionMessage, this.aisStreamHandler);
        this.aisStreamWebsocketClient.connect();
    }

    public void closeConnection() {
        if (this.aisStreamWebsocketClient == null) {
            Log.info("No AisStream connection to close");
            return;
        }
        Log.info("Closing AisStream connection");
        this.aisStreamWebsocketClient.close();
        this.aisStreamWebsocketClient = null;
    }
}
