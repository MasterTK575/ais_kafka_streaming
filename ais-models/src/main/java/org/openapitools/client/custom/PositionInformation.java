package org.openapitools.client.custom;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PositionInformation {
    private double latitude;
    private double longitude;
    private double speedOverGround;
    private int trueHeading;
}
