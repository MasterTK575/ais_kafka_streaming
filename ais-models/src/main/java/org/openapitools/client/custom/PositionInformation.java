package org.openapitools.client.custom;

import lombok.Value;

@Value
public class PositionInformation {
    double latitude;
    double longitude;
    double courseOverGround;
    double speedOverGround;
    int trueHeading;
    int timeStamp;
}
