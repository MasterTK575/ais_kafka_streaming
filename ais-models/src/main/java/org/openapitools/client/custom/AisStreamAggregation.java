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
    private AisStreamMessage lastMessage;

    public AisStreamAggregation updateFrom(Long mmsi, AisStreamMessage aisStreamMessage) {
        if (mmsi == null || aisStreamMessage == null) {
            throw new IllegalArgumentException("Parameter must not be null");
        }
        this.mmsi = mmsi;
        this.orderedMessages
                .computeIfAbsent(aisStreamMessage.getMessageType(), k -> new ArrayList<>())
                .add(aisStreamMessage);
        lastMessage = aisStreamMessage;
        return this;
    }
}
