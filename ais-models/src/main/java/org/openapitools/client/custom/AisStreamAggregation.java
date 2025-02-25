package org.openapitools.client.custom;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openapitools.client.model.AisMessageTypes;
import org.openapitools.client.model.AisStreamMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonSerialize
public class AisStreamAggregation {
    @EqualsAndHashCode.Include
    private long mmsi;

    private final Map<AisMessageTypes, List<AisStreamMessage>> orderedMessages = new HashMap<>();
    private final List<PositionInformation> positionsHistory = new ArrayList<>();
    private PositionInformation currentPosition;
    private int messageCount;

    public AisStreamAggregation updateFrom(
            Long mmsi, AisStreamMessage aisStreamMessage, PositionInformation positionInformation) {
        if (mmsi == null) {
            throw new IllegalArgumentException("MMSI must not be null");
        }
        this.mmsi = mmsi;
        this.orderedMessages
                .computeIfAbsent(aisStreamMessage.getMessageType(), k -> new ArrayList<>())
                .add(aisStreamMessage);
        if (positionInformation != null) {
            this.positionsHistory.add(positionInformation);
            this.currentPosition = positionInformation;
        }
        this.messageCount++;
        return this;
    }
}
