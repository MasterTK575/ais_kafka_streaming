package org.openapitools.client.custom;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class PositionInformation {
    private double latitude;
    private double longitude;
    private double courseOverGround;
    private double speedOverGround;
    private int trueHeading;
    private int timeStamp;
}
