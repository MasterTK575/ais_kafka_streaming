package com.haw.hurtigruten.aisstream.gateway;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.openapitools.client.custom.SubscriptionAction;

@ApplicationScoped
public class AisStreamSubscriptionGateway {

    @Channel("ais-subscriptions")
    Emitter<SubscriptionAction> subscriptionMessageEmitter;

    public void emit(SubscriptionAction subscriptionAction ) {
        this.subscriptionMessageEmitter.send(subscriptionAction);
   }
}
