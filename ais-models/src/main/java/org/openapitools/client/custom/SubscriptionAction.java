package org.openapitools.client.custom;

import lombok.*;
import org.openapitools.client.model.AisMessageTypes;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionAction {
    private boolean closeConnection = false;
    private List<List<List<Double>>> boundingBoxes = new ArrayList<>();
    private List<String> filtersShipMMSI = new ArrayList<>();
    private List<AisMessageTypes> filterMessageTypes = new ArrayList<>();
}
