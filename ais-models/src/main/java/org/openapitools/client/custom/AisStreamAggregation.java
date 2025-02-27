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

    public static final int MAX_SHIP_DATA_HISTORY_SIZE = 10;

    @EqualsAndHashCode.Include
    private long mmsi;

    private final Map<AisMessageTypes, Integer> messageTypes = new HashMap<>();
    private final List<AisShipData> shipDataHistory = new ArrayList<>();
    private AisShipData mostRecentShipData;

    public AisStreamAggregation updateFrom(Long mmsi, AisStreamMessage aisStreamMessage, AisShipData shipData) {
        if (mmsi == null || aisStreamMessage == null || shipData == null) {
            throw new IllegalArgumentException("Parameter must not be null");
        }
        this.mmsi = mmsi;
        this.messageTypes.merge(aisStreamMessage.getMessageType(), 1, Integer::sum);
        this.shipDataHistory.add(shipData);
        if (this.shipDataHistory.size() > MAX_SHIP_DATA_HISTORY_SIZE) {
            this.shipDataHistory.remove(0);
        }
        this.mostRecentShipData.updateFrom(shipData);
        return this;
    }
}
