package com.haw.producer.ais.gateway;

import io.quarkus.logging.Log;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.OnOverflow;
import org.openapitools.client.model.AisStreamMessage;
import org.openapitools.client.model.Error;

import java.util.Map;

@ApplicationScoped
public class AisStreamGateway {

    public static final String MMSI = "MMSI";

    @Channel("ais-messages-raw")
    @OnOverflow(value = OnOverflow.Strategy.LATEST, bufferSize = 256)
    Emitter<Record<Long, AisStreamMessage>> aisMessageEmitter;

    public void handleAisStreamMessage(AisStreamMessage aisStreamMessage) {
        this.aisMessageEmitter.send(this.createRecord(aisStreamMessage));
    }

    public void handleAisStreamError(Error error) {
        Log.info("Received error message: " + error);
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
