package org.openapitools.client.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NavigationalStatus {
    UNDER_WAY_USING_ENGINE(0, "Under way using engine"),
    AT_ANCHOR(1, "At anchor"),
    NOT_UNDER_COMMAND(2, "Not under command"),
    RESTRICTED_MANOEUVRABILITY(3, "Restricted manoeuverability"),
    CONSTRAINED_BY_HER_DRAUGHT(4, "Constrained by her draught"),
    MOORED(5, "Moored"),
    AGROUND(6, "Aground"),
    ENGAGED_IN_FISHING(7, "Engaged in Fishing"),
    UNDER_WAY_SAILING(8, "Under way sailing"),
    RESERVED_FOR_FUTURE_AMENDMENT_HSC(9, "Reserved for future amendment of Navigational Status for HSC"),
    RESERVED_FOR_FUTURE_AMENDMENT_WIG(10, "Reserved for future amendment of Navigational Status for WIG"),
    RESERVED_FOR_FUTURE_USE_11(11, "Reserved for future use"),
    RESERVED_FOR_FUTURE_USE_12(12, "Reserved for future use"),
    RESERVED_FOR_FUTURE_USE_13(13, "Reserved for future use"),
    AIS_SART_ACTIVE(14, "AIS-SART is active"),
    NOT_DEFINED(15, "Not defined (default)");

    private final int code;
    private final String description;

    public static NavigationalStatus fromCode(int code) {
        for (NavigationalStatus status : NavigationalStatus.values()) {
            if (status.code == code) {
                return status;
            }
        }
        return NOT_DEFINED;
    }

    @Override
    public String toString() {
        return description;
    }
}