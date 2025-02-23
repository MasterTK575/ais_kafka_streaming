package org.openapitools.client.custom;

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
public class AisStreamAggregation {
    @EqualsAndHashCode.Include
    private long MMSI;

    private final Map<AisMessageTypes, Integer> messageTypes = new HashMap<>();
    private final List<PositionInformation> positions = new ArrayList<>();
    private int messageCount;

    public AisStreamAggregation updateFrom(
            Long MMSI, AisStreamMessage aisStreamMessage, PositionInformation positionInformation) {
        if (MMSI != null) this.MMSI = MMSI;
        this.messageTypes.merge(aisStreamMessage.getMessageType(), 1, Integer::sum);
        if (positionInformation != null) this.positions.add(positionInformation);
        this.messageCount++;
        return this;
    }
}
