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

/**
 * Gateway for handling AIS stream messages.
 * It sends the AIS stream messages received from the Ais API to the ais-messages-raw channel.
 */
@ApplicationScoped
public class AisStreamGateway {

    public static final String MMSI = "MMSI";

    @Channel("ais-messages-raw")
    @OnOverflow(value = OnOverflow.Strategy.LATEST, bufferSize = 256)
    Emitter<Record<Long, AisStreamMessage>> aisMessageEmitter;

    /**
     * Handles the AIS stream message by sending it to the ais-messages-raw channel.
     * @param aisStreamMessage the AIS stream message
     */
    public void handleAisStreamMessage(AisStreamMessage aisStreamMessage) {
        this.aisMessageEmitter.send(this.createRecord(aisStreamMessage));
    }

    public void handleAisStreamError(Error error) {
        Log.error("Received error message: " + error);
    }

    /**
     * Creates a record with the MMSI as the key and the AIS stream message as the value.
     * @param aisStreamMessage the AIS stream message
     * @return the record
     */
    private Record<Long, AisStreamMessage> createRecord(AisStreamMessage aisStreamMessage) {
        return Record.of(this.extractMetaDataValue(aisStreamMessage, MMSI), aisStreamMessage);
    }

    /**
     * Extracts the value of the given metadata key from the AIS stream message.
     * @param aisStreamMessage the AIS stream message
     * @param metaDataKey the metadata key
     * @return the value of the metadata key
     */
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
