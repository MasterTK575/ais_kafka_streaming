package org.openapitools.client.custom;

import lombok.*;

import javax.annotation.CheckForNull;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AisShipData {
    private long mmsi;

    @CheckForNull
    private String shipName;

    @CheckForNull
    private AisShipType shipType;

    @CheckForNull
    private String destination;

    @CheckForNull
    private String eta;

    @CheckForNull
    private PositionInformation currentPosition;

    @CheckForNull
    private NavigationalStatus navigationalStatus;

    @CheckForNull
    private String timestamp;
}
