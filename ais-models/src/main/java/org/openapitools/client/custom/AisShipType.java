package org.openapitools.client.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AisShipType {
    NOT_AVAILABLE(0, "Not available (default)"),
    RESERVED_1_19(1, "Reserved for future use"),
    WIG_ALL(20, "Wing in ground (WIG), all ships of this type"),
    WIG_HAZARDOUS_A(21, "Wing in ground (WIG), Hazardous category A"),
    WIG_HAZARDOUS_B(22, "Wing in ground (WIG), Hazardous category B"),
    WIG_HAZARDOUS_C(23, "Wing in ground (WIG), Hazardous category C"),
    WIG_HAZARDOUS_D(24, "Wing in ground (WIG), Hazardous category D"),
    WIG_RESERVED_25(25, "Wing in ground (WIG), Reserved for future use"),
    WIG_RESERVED_26(26, "Wing in ground (WIG), Reserved for future use"),
    WIG_RESERVED_27(27, "Wing in ground (WIG), Reserved for future use"),
    WIG_RESERVED_28(28, "Wing in ground (WIG), Reserved for future use"),
    WIG_RESERVED_29(29, "Wing in ground (WIG), Reserved for future use"),
    FISHING(30, "Fishing"),
    TOWING(31, "Towing"),
    TOWING_EXCEEDS(32, "Towing: length exceeds 200m or breadth exceeds 25m"),
    DREDGING_UNDERWATER_OPS(33, "Dredging or underwater ops"),
    DIVING_OPS(34, "Diving ops"),
    MILITARY_OPS(35, "Military ops"),
    SAILING(36, "Sailing"),
    PLEASURE_CRAFT(37, "Pleasure Craft"),
    RESERVED_38(38, "Reserved"),
    RESERVED_39(39, "Reserved"),
    HSC_ALL(40, "High speed craft (HSC), all ships of this type"),
    HSC_HAZARDOUS_A(41, "High speed craft (HSC), Hazardous category A"),
    HSC_HAZARDOUS_B(42, "High speed craft (HSC), Hazardous category B"),
    HSC_HAZARDOUS_C(43, "High speed craft (HSC), Hazardous category C"),
    HSC_HAZARDOUS_D(44, "High speed craft (HSC), Hazardous category D"),
    HSC_RESERVED_45(45, "High speed craft (HSC), Reserved for future use"),
    HSC_RESERVED_46(46, "High speed craft (HSC), Reserved for future use"),
    HSC_RESERVED_47(47, "High speed craft (HSC), Reserved for future use"),
    HSC_RESERVED_48(48, "High speed craft (HSC), Reserved for future use"),
    HSC_NO_INFO(49, "High speed craft (HSC), No additional information"),
    PILOT_VESSEL(50, "Pilot Vessel"),
    SEARCH_RESCUE(51, "Search and Rescue vessel"),
    TUG(52, "Tug"),
    PORT_TENDER(53, "Port Tender"),
    ANTI_POLLUTION(54, "Anti-pollution equipment"),
    LAW_ENFORCEMENT(55, "Law Enforcement"),
    SPARE_LOCAL_56(56, "Spare - Local Vessel"),
    SPARE_LOCAL_57(57, "Spare - Local Vessel"),
    MEDICAL_TRANSPORT(58, "Medical Transport"),
    NONCOMBATANT(59, "Noncombatant ship according to RR Resolution No. 18"),
    PASSENGER_ALL(60, "Passenger, all ships of this type"),
    PASSENGER_HAZARDOUS_A(61, "Passenger, Hazardous category A"),
    PASSENGER_HAZARDOUS_B(62, "Passenger, Hazardous category B"),
    PASSENGER_HAZARDOUS_C(63, "Passenger, Hazardous category C"),
    PASSENGER_HAZARDOUS_D(64, "Passenger, Hazardous category D"),
    PASSENGER_RESERVED_65(65, "Passenger, Reserved for future use"),
    PASSENGER_RESERVED_66(66, "Passenger, Reserved for future use"),
    PASSENGER_RESERVED_67(67, "Passenger, Reserved for future use"),
    PASSENGER_RESERVED_68(68, "Passenger, Reserved for future use"),
    PASSENGER_NO_INFO(69, "Passenger, No additional information"),
    CARGO_ALL(70, "Cargo, all ships of this type"),
    CARGO_HAZARDOUS_A(71, "Cargo, Hazardous category A"),
    CARGO_HAZARDOUS_B(72, "Cargo, Hazardous category B"),
    CARGO_HAZARDOUS_C(73, "Cargo, Hazardous category C"),
    CARGO_HAZARDOUS_D(74, "Cargo, Hazardous category D"),
    CARGO_RESERVED_75(75, "Cargo, Reserved for future use"),
    CARGO_RESERVED_76(76, "Cargo, Reserved for future use"),
    CARGO_RESERVED_77(77, "Cargo, Reserved for future use"),
    CARGO_RESERVED_78(78, "Cargo, Reserved for future use"),
    CARGO_NO_INFO(79, "Cargo, No additional information"),
    TANKER_ALL(80, "Tanker, all ships of this type"),
    TANKER_HAZARDOUS_A(81, "Tanker, Hazardous category A"),
    TANKER_HAZARDOUS_B(82, "Tanker, Hazardous category B"),
    TANKER_HAZARDOUS_C(83, "Tanker, Hazardous category C"),
    TANKER_HAZARDOUS_D(84, "Tanker, Hazardous category D"),
    TANKER_RESERVED_85(85, "Tanker, Reserved for future use"),
    TANKER_RESERVED_86(86, "Tanker, Reserved for future use"),
    TANKER_RESERVED_87(87, "Tanker, Reserved for future use"),
    TANKER_RESERVED_88(88, "Tanker, Reserved for future use"),
    TANKER_NO_INFO(89, "Tanker, No additional information"),
    OTHER_ALL(90, "Other Type, all ships of this type"),
    OTHER_HAZARDOUS_A(91, "Other Type, Hazardous category A"),
    OTHER_HAZARDOUS_B(92, "Other Type, Hazardous category B"),
    OTHER_HAZARDOUS_C(93, "Other Type, Hazardous category C"),
    OTHER_HAZARDOUS_D(94, "Other Type, Hazardous category D"),
    OTHER_RESERVED_95(95, "Other Type, Reserved for future use"),
    OTHER_RESERVED_96(96, "Other Type, Reserved for future use"),
    OTHER_RESERVED_97(97, "Other Type, Reserved for future use"),
    OTHER_RESERVED_98(98, "Other Type, Reserved for future use"),
    OTHER_NO_INFO(99, "Other Type, no additional information");

    private final int code;
    private final String description;

    public static AisShipType fromCode(int code) {
        for (AisShipType type : AisShipType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        return NOT_AVAILABLE;
    }

    @Override
    public String toString() {
        return description;
    }
}
