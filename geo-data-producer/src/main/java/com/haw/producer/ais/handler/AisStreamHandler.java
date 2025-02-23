package com.haw.producer.ais.handler;

import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.openapitools.client.model.AisStreamMessage;
import org.openapitools.client.model.Error;

import java.util.Map;

@ApplicationScoped
public class AisStreamHandler {

    public static final String MMSI = "MMSI";

    @Channel("ais-messages-raw")
    Emitter<Record<Long, AisStreamMessage>> aisMessageEmitter;

    public void handleAisStreamMessage(AisStreamMessage aisStreamMessage) {
        this.aisMessageEmitter.send(this.createRecord(aisStreamMessage));
   }

   public void handleAisStreamError(Error error) {
        // TODO: log error
       System.out.println(error);
   }

   private Record<Long, AisStreamMessage> createRecord(AisStreamMessage aisStreamMessage) {
        return Record.of(this.extractMetaDataValue(aisStreamMessage, MMSI), aisStreamMessage);
   }

   private Long extractMetaDataValue(AisStreamMessage aisStreamMessage, Object metaDataKey) {
       Object metaDataObj = aisStreamMessage.getMetaData();
       if (metaDataObj instanceof Map<?, ?> metaDataMap) {
           Object metaDataObject = metaDataMap.get(metaDataKey);
           switch (metaDataObject) {
               case Number number -> {
                   return number.longValue();
               }
               case String s -> {
                   return Long.valueOf(s);
               }
               default -> {
                   return null;
               }
           }
       }
       return null;
   }
}
