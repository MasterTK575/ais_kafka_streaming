package com.haw.producer.ais.handler;

import jakarta.enterprise.context.ApplicationScoped;
import org.openapitools.client.model.AisStreamMessage;
import org.openapitools.client.model.Error;

@ApplicationScoped
public class AisStreamHandler {

   public void handleAisStreamMessage(AisStreamMessage aisStreamMessage) {
       System.out.println(aisStreamMessage.getMessageType());
   }

   public void handleAisStreamError(Error error) {
       System.out.println(error);
   }
}
