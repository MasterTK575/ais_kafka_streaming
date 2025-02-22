package com.haw.producer.ais.client;

import com.haw.producer.ais.handler.AisStreamHandler;
import com.haw.producer.ais.websocket.AisStreamWebsocketClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.openapitools.client.model.SubscriptionMessage;

import java.net.URI;
import java.net.URISyntaxException;

@ApplicationScoped
public class AisStreamClient {

    public static final String AIS_STREAMS_URI = "wss://stream.aisstream.io/v0/stream";

    private AisStreamWebsocketClient aisStreamWebsocketClient;

    @Inject
    AisStreamHandler aisStreamHandler;

    public void createWebSocketClient(SubscriptionMessage subscriptionMessage) throws URISyntaxException {
        if (this.aisStreamWebsocketClient != null) {
            this.close();
        }
        this.aisStreamWebsocketClient =  new AisStreamWebsocketClient(new URI(AIS_STREAMS_URI), subscriptionMessage, aisStreamHandler);
    }

    public void connect() {
        this.aisStreamWebsocketClient.connect();
    }

    public void close() {
        this.aisStreamWebsocketClient.close();
    }

    public void updateSubscription(SubscriptionMessage subscriptionMessage) {
        this.aisStreamWebsocketClient.updateSubscription(subscriptionMessage);
    }
}
