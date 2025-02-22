package com.haw.producer.ais.client;

import com.haw.producer.ais.exceptions.NoAisStreamConnectionException;
import com.haw.producer.ais.handler.AisStreamHandler;
import com.haw.producer.ais.websocket.AisStreamWebsocketClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.openapitools.client.model.SubscriptionMessage;

import java.net.URI;
import java.net.URISyntaxException;

@ApplicationScoped
public class AisStreamClient {

    @ConfigProperty(name = "ais.streams.api.uri")
    String aisStreamsApiUri;

    @Inject
    AisStreamHandler aisStreamHandler;

    private AisStreamWebsocketClient aisStreamWebsocketClient;

    public void connectToAisStream(SubscriptionMessage subscriptionMessage) throws URISyntaxException {
        this.aisStreamWebsocketClient =  new AisStreamWebsocketClient(new URI(this.aisStreamsApiUri), subscriptionMessage, this.aisStreamHandler);
        this.aisStreamWebsocketClient.connect();
    }

    public void closeConnection() throws NoAisStreamConnectionException {
        if (this.aisStreamWebsocketClient == null) {
            throw new NoAisStreamConnectionException();
        }
        this.aisStreamWebsocketClient.close();
    }

    public void updateAisStreamSubscription(SubscriptionMessage subscriptionMessage) throws NoAisStreamConnectionException {
        if (this.aisStreamWebsocketClient == null) {
            throw new NoAisStreamConnectionException();
        }
        this.aisStreamWebsocketClient.updateSubscription(subscriptionMessage);
    }
}
