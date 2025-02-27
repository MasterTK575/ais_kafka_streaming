package org.openapitools.client.custom;

import lombok.*;

import javax.annotation.CheckForNull;

@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class AisShipData {
    @EqualsAndHashCode.Include
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

    public void updateFrom(AisShipData aisShipData) {
        if (aisShipData == null) {
            throw new IllegalArgumentException("Parameter must not be null");
        }
        this.mmsi = aisShipData.getMmsi();
        if (aisShipData.getShipName() != null) {
            this.shipName = aisShipData.getShipName();
        }
        if (aisShipData.getShipType() != null) {
            this.shipType = aisShipData.getShipType();
        }
        if (aisShipData.getDestination() != null) {
            this.destination = aisShipData.getDestination();
        }
        if (aisShipData.getEta() != null) {
            this.eta = aisShipData.getEta();
        }
        if (aisShipData.getCurrentPosition() != null) {
            this.currentPosition = aisShipData.getCurrentPosition();
        }
        if (aisShipData.getNavigationalStatus() != null) {
            this.navigationalStatus = aisShipData.getNavigationalStatus();
        }
        if (aisShipData.getTimestamp() != null) {
            this.timestamp = aisShipData.getTimestamp();
        }
    }
}
