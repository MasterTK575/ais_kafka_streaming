package org.openapitools.client.custom;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.openapitools.client.model.AisMessageTypes;
import org.openapitools.client.model.AisStreamMessage;

@ToString
@EqualsAndHashCode
public class AisStreamAggregation {
    Long MMSI;
    AisMessageTypes messageType;
    long count;

    public AisStreamAggregation updateFrom(Long MMSI, AisStreamMessage aisStreamMessage) {
        this.MMSI = MMSI;
        this.messageType = aisStreamMessage.getMessageType();
        this.count++;
        return this;
    }
}
