package com.haw.producer.ais.client;

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

    public void createWebSocketClient(SubscriptionMessage subscriptionMessage) throws URISyntaxException {
        if (this.aisStreamWebsocketClient != null) {
            this.close();
        }
        this.aisStreamWebsocketClient =  new AisStreamWebsocketClient(new URI(aisStreamsApiUri), subscriptionMessage, aisStreamHandler);
    }

    public void connect() {
        if (this.aisStreamWebsocketClient == null) {
            return;
        }
        this.aisStreamWebsocketClient.connect();
    }

    public void close() {
        if (this.aisStreamWebsocketClient == null) {
            return;
        }
        this.aisStreamWebsocketClient.close();
    }

    public void updateSubscription(SubscriptionMessage subscriptionMessage) {
        if (this.aisStreamWebsocketClient == null) {
            return;
        }
        this.aisStreamWebsocketClient.updateSubscription(subscriptionMessage);
    }
}
