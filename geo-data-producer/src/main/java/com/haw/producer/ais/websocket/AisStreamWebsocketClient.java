package com.haw.producer.ais.websocket;

import com.haw.producer.ais.handler.AisStreamHandler;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.openapitools.client.model.AisStreamMessage;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.SubscriptionMessage;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * Websocket client for connecting to the AIS stream
 */
public class AisStreamWebsocketClient extends WebSocketClient {

    private final AisStreamHandler aisStreamHandler;
    private SubscriptionMessage subscriptionMessage;

    public AisStreamWebsocketClient(URI serverURI, SubscriptionMessage subscriptionMessage, AisStreamHandler aisStreamHandler) {
        super(serverURI);
        this.subscriptionMessage = subscriptionMessage;
        this.aisStreamHandler = aisStreamHandler;
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        // send subscription message upon connection
        send(this.subscriptionMessage.toJson());
    }

    public void updateSubscription(SubscriptionMessage subscriptionMessage) {
        this.subscriptionMessage = subscriptionMessage;
        send(subscriptionMessage.toJson());
    }

    @Override
    public void onMessage(ByteBuffer message) {
        String jsonString = StandardCharsets.UTF_8.decode(message).toString();

        try {
            AisStreamMessage aisStreamMessage = AisStreamMessage.fromJson(jsonString);
            this.aisStreamHandler.handleAisStreamMessage(aisStreamMessage);
            return;
        } catch (IOException ignored) {}

        try {
            Error error = Error.fromJson(jsonString);
            this.aisStreamHandler.handleAisStreamError(error);
        } catch (IOException ex) {
            // TODO log exception
            ex.printStackTrace();
        }

    }

    @Override
    public void onMessage(String message) {
        // unused as aisstream.io returns messages as byte buffers
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        // The close codes are documented in class org.java_websocket.framing.CloseFrame
        System.out.println(
                "Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: "
                        + reason);
    }

    @Override
    public void onError(Exception ex) {
        // TODO log exception
        ex.printStackTrace();
    }
}
