package com.haw.hurtigruten.aisstream.gateway;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.openapitools.client.custom.SubscriptionAction;

/**
 * Gateway for handling AIS stream subscriptions.
 * It sends the subscription actions to the ais-subscriptions channel.
 */
@ApplicationScoped
public class AisStreamSubscriptionGateway {

    @Channel("ais-subscriptions")
    Emitter<SubscriptionAction> subscriptionMessageEmitter;

    /**
     * Emits the subscription action by sending it to the ais-subscriptions channel.
     * @param subscriptionAction the subscription action
     */
    public void emit(SubscriptionAction subscriptionAction) {
        this.subscriptionMessageEmitter.send(subscriptionAction);
    }
}
