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
    private long MMSI;

    private final Map<AisMessageTypes, Integer> messageTypes = new HashMap<>();
    private final List<PositionInformation> positionsHistory = new ArrayList<>();
    private PositionInformation currentPosition;
    private int messageCount;

    public AisStreamAggregation updateFrom(
            Long MMSI, AisStreamMessage aisStreamMessage, PositionInformation positionInformation) {
        if (MMSI != null) this.MMSI = MMSI;
        this.messageTypes.merge(aisStreamMessage.getMessageType(), 1, Integer::sum);
        if (positionInformation != null) {
            this.positionsHistory.add(positionInformation);
            this.currentPosition = positionInformation;
        }
        this.messageCount++;
        return this;
    }
}
