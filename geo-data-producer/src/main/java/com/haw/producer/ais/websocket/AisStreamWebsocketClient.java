package com.haw.producer.ais.websocket;

import com.haw.producer.ais.gateway.AisStreamGateway;
import io.quarkus.logging.Log;
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
 * Websocket client for connecting to the AIS stream.
 * It sends the subscription message upon connection and forwards the received messages to the ais stream gateway.
 */
public class AisStreamWebsocketClient extends WebSocketClient {

    private final AisStreamGateway aisStreamGateway;
    private SubscriptionMessage subscriptionMessage;

    public AisStreamWebsocketClient(
            URI serverURI, SubscriptionMessage subscriptionMessage, AisStreamGateway aisStreamGateway) {
        super(serverURI);
        this.subscriptionMessage = subscriptionMessage;
        this.aisStreamGateway = aisStreamGateway;
    }

    /**
     * Called when the websocket connection is opened.
     * It sends the subscription message upon connection.
     * @param handshakedata The handshake of the websocket instance
     */
    @Override
    public void onOpen(ServerHandshake handshakedata) {
        // send subscription message upon connection
        send(this.subscriptionMessage.toJson());
    }

    /**
     * Updates the subscription message and sends it to the AIS stream.
     * @param subscriptionMessage the new subscription message
     */
    public void updateSubscription(SubscriptionMessage subscriptionMessage) {
        this.subscriptionMessage = subscriptionMessage;
        send(subscriptionMessage.toJson());
    }

    /**
     * Called when a message is received from the AIS stream.
     * It parses the message and forwards it to the ais stream gateway.
     * @param message The binary message that was received.
     */
    @Override
    public void onMessage(ByteBuffer message) {
        String jsonString = StandardCharsets.UTF_8.decode(message).toString();

        try {
            AisStreamMessage aisStreamMessage = AisStreamMessage.fromJson(jsonString);
            this.aisStreamGateway.handleAisStreamMessage(aisStreamMessage);
            return;
        } catch (IOException ignored) {
        }

        try {
            Error error = Error.fromJson(jsonString);
            this.aisStreamGateway.handleAisStreamError(error);
        } catch (IOException ex) {
            Log.error("An error occurred while parsing ais message {}", ex);
        }
    }

    @Override
    public void onMessage(String message) {
        // unused as aisstream.io returns messages as byte buffers
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        // The close codes are documented in class org.java_websocket.framing.CloseFrame
        Log.info("Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        Log.error("An error occurred in the websocket connection {}", ex);
    }
}
