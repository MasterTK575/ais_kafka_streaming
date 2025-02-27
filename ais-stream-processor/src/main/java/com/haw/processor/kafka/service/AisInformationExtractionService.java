package com.haw.processor.kafka.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.openapitools.client.custom.AisShipData;
import org.openapitools.client.custom.AisShipType;
import org.openapitools.client.custom.NavigationalStatus;
import org.openapitools.client.custom.PositionInformation;
import org.openapitools.client.model.*;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

@ApplicationScoped
public class AisInformationExtractionService {

    public AisShipData getShipData(long mmsi, AisStreamMessage aisStreamMessage) {
        String shipName = null, timestamp = null;

        Object metaDataObj = aisStreamMessage.getMetaData();
        if (metaDataObj instanceof Map<?, ?> metaDataMap) {
            Object metaDataObject = metaDataMap.get("ShipName");
            if (metaDataObject instanceof String str && !str.isBlank()) {
                shipName = str.trim();
            } else {
                shipName = this.getShipName(aisStreamMessage);
            }
            metaDataObject = metaDataMap.get("time_utc");
            if (metaDataObject instanceof String str) {
                timestamp = str.trim();
            }
        }
        String destination = this.getDestination(aisStreamMessage);
        PositionInformation currentPosition = this.getPositionInformation(aisStreamMessage);
        AisShipType shipType = this.getShipType(aisStreamMessage);
        NavigationalStatus navigationalStatus = this.getNavigationalStatus(aisStreamMessage);
        String eta = this.parseEta(aisStreamMessage);
        return new AisShipData(
                mmsi, shipName, shipType, destination, eta, currentPosition, navigationalStatus, timestamp);
    }

    private String getShipName(AisStreamMessage aisStreamMessage) {
        return switch (aisStreamMessage.getMessageType()) {
            case AisMessageTypes.SHIP_STATIC_DATA -> {
                ShipStaticData shipStaticData = aisStreamMessage.getMessage().getShipStaticData();
                String name = shipStaticData != null ? shipStaticData.getName().trim() : null;
                yield name != null && !name.isBlank() ? name : null;
            }
            case AisMessageTypes.STATIC_DATA_REPORT -> {
                StaticDataReport staticDataReport =
                        aisStreamMessage.getMessage().getStaticDataReport();
                String name = staticDataReport != null
                        ? staticDataReport.getReportA().getName().trim()
                        : null;
                yield name != null && !name.isBlank() ? name : null;
            }
            default -> null;
        };
    }

    private String getDestination(AisStreamMessage aisStreamMessage) {
        ShipStaticData shipStaticData = aisStreamMessage.getMessage().getShipStaticData();
        String destination =
                shipStaticData != null ? shipStaticData.getDestination().trim() : null;
        return destination != null && !destination.isBlank() ? destination : null;
    }

    /**
     * @param aisStreamMessage The incoming AIS message.
     * @return ETA String converted to system default zone, or null if not available.
     */
    private String parseEta(AisStreamMessage aisStreamMessage) {
        ShipStaticData shipStaticData = aisStreamMessage.getMessage().getShipStaticData();
        if (shipStaticData == null) {
            return null;
        }

        ShipStaticDataEta eta = shipStaticData.getEta();
        int month = eta.getMonth();
        int day = eta.getDay();
        int hour = eta.getHour();
        int minute = eta.getMinute();

        ZoneId utcZone = ZoneId.of("UTC");
        ZonedDateTime etaDateTime;
        try {
            etaDateTime = ZonedDateTime.now(utcZone)
                    .plusMonths(month)
                    .plusDays(day)
                    .plusHours(hour)
                    .plusMinutes(minute);
        } catch (DateTimeException e) {
            // Invalid date, assume no ETA available
            return null;
        }

        return etaDateTime.toInstant().atZone(ZoneId.systemDefault()).toString();
    }

    private NavigationalStatus getNavigationalStatus(AisStreamMessage aisStreamMessage) {
        PositionReport positionReport = aisStreamMessage.getMessage().getPositionReport();
        return positionReport != null ? NavigationalStatus.fromCode(positionReport.getNavigationalStatus()) : null;
    }

    private AisShipType getShipType(AisStreamMessage aisStreamMessage) {
        return switch (aisStreamMessage.getMessageType()) {
            case AisMessageTypes.SHIP_STATIC_DATA -> {
                ShipStaticData shipStaticData = aisStreamMessage.getMessage().getShipStaticData();
                yield shipStaticData != null ? AisShipType.fromCode(shipStaticData.getType()) : null;
            }
            case AisMessageTypes.STATIC_DATA_REPORT -> {
                StaticDataReport staticDataReport =
                        aisStreamMessage.getMessage().getStaticDataReport();
                yield staticDataReport != null
                        ? AisShipType.fromCode(staticDataReport.getReportB().getShipType())
                        : null;
            }
            default -> null;
        };
    }

    /**
     * @return PositionInformation or null if the message type is not a position report
     */
    private PositionInformation getPositionInformation(AisStreamMessage aisStreamMessage) {
        return switch (aisStreamMessage.getMessageType()) {
            case AisMessageTypes.POSITION_REPORT -> {
                PositionReport positionReport = aisStreamMessage.getMessage().getPositionReport();
                yield positionReport != null
                        ? new PositionInformation(
                                positionReport.getLatitude(),
                                positionReport.getLongitude(),
                                positionReport.getSog(),
                                this.getHeading(positionReport))
                        : null;
            }
            case AisMessageTypes.STANDARD_CLASS_B_POSITION_REPORT -> {
                StandardClassBPositionReport standardClassBPositionReport =
                        aisStreamMessage.getMessage().getStandardClassBPositionReport();
                yield standardClassBPositionReport != null
                        ? new PositionInformation(
                                standardClassBPositionReport.getLatitude(),
                                standardClassBPositionReport.getLongitude(),
                                standardClassBPositionReport.getSog(),
                                this.getHeading(standardClassBPositionReport))
                        : null;
            }
            case AisMessageTypes.EXTENDED_CLASS_B_POSITION_REPORT -> {
                ExtendedClassBPositionReport extendedClassBPositionReport =
                        aisStreamMessage.getMessage().getExtendedClassBPositionReport();
                yield extendedClassBPositionReport != null
                        ? new PositionInformation(
                                extendedClassBPositionReport.getLatitude(),
                                extendedClassBPositionReport.getLongitude(),
                                extendedClassBPositionReport.getSog(),
                                this.getHeading(extendedClassBPositionReport))
                        : null;
            }
            default -> null;
        };
    }

    private int getHeading(int trueHeading, Double cog) {
        return trueHeading <= 360 ? trueHeading : cog.intValue();
    }

    private int getHeading(PositionReport positionReport) {
        return this.getHeading(positionReport.getTrueHeading(), positionReport.getCog());
    }

    private int getHeading(ExtendedClassBPositionReport extendedClassBPositionReport) {
        return this.getHeading(extendedClassBPositionReport.getTrueHeading(), extendedClassBPositionReport.getCog());
    }

    private int getHeading(StandardClassBPositionReport standardClassBPositionReport) {
        return this.getHeading(standardClassBPositionReport.getTrueHeading(), standardClassBPositionReport.getCog());
    }
}
