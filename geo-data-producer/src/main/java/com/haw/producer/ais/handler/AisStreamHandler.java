package com.haw.producer.ais.handler;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.openapitools.client.model.AisStreamMessage;
import org.openapitools.client.model.Error;

@ApplicationScoped
public class AisStreamHandler {

    @Channel("ais-messages-raw")
    Emitter<AisStreamMessage> aisMessageEmitter;

    public void handleAisStreamMessage(AisStreamMessage aisStreamMessage) {
        this.aisMessageEmitter.send(aisStreamMessage);
   }

   public void handleAisStreamError(Error error) {
        // TODO: log error
       System.out.println(error);
   }
}
