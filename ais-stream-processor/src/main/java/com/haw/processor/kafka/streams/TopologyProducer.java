package com.haw.processor.kafka.streams;

import io.quarkus.kafka.client.serialization.ObjectMapperSerde;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;
import org.openapitools.client.custom.*;
import org.openapitools.client.model.*;

import java.time.DateTimeException;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

@ApplicationScoped
public class TopologyProducer {

    private static final String AIS_MESSAGES_RAW_TOPIC = "ais-messages-raw";
    private static final String AIS_SHIP_DATA_TOPIC = "ais-ship-data";
    public static final String AIS_AGGREGATION_STORE = "ais-aggregation-store";

    @Produces
    public Topology buildTopology() {
        StreamsBuilder builder = new StreamsBuilder();

        ObjectMapperSerde<AisStreamMessage> aisStreamMessageSerde = new ObjectMapperSerde<>(AisStreamMessage.class);
        ObjectMapperSerde<AisStreamAggregation> aisStreamAggregationSerde =
                new ObjectMapperSerde<>(AisStreamAggregation.class);
        ObjectMapperSerde<AisShipData> aisShipDataSerde = new ObjectMapperSerde<>(AisShipData.class);

        KeyValueBytesStoreSupplier storeSupplier = Stores.persistentKeyValueStore(AIS_AGGREGATION_STORE);

        builder.stream(AIS_MESSAGES_RAW_TOPIC, Consumed.with(Serdes.Long(), aisStreamMessageSerde))
                .groupByKey()
                // null keys are automatically filtered out
                .aggregate(
                        AisStreamAggregation::new,
                        (mmsi, aisStreamMessage, aisStreamAggregation) ->
                                aisStreamAggregation.updateFrom(mmsi, aisStreamMessage),
                        Materialized.<Long, AisStreamAggregation>as(storeSupplier)
                                .withKeySerde(Serdes.Long())
                                .withValueSerde(aisStreamAggregationSerde))
                .toStream()
                .map((mmsi, aisStreamAggregation) ->
                        KeyValue.pair(mmsi, this.getShipData(mmsi, aisStreamAggregation.getLastMessage())))
                .to(AIS_SHIP_DATA_TOPIC, Produced.with(Serdes.Long(), aisShipDataSerde));

        return builder.build();
    }

    // TODO: use aggregation for internal storage and maybe interactive query

    private AisShipData getShipData(long mmsi, AisStreamMessage aisStreamMessage) {
        String shipName = null, timestamp = null;

        Object metaDataObj = aisStreamMessage.getMetaData();
        if (metaDataObj instanceof Map<?, ?> metaDataMap) {
            Object metaDataObject = metaDataMap.get("ShipName");
            if (metaDataObject instanceof String str) {
                shipName = str.trim();
            } else {
                shipName = this.getShipName(aisStreamMessage);
            }
            metaDataObject = metaDataMap.get("time_utc");
            if (metaDataObject instanceof String) {
                timestamp = (String) metaDataObject;
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
                yield shipStaticData != null ? shipStaticData.getName().trim() : null;
            }
            case AisMessageTypes.STATIC_DATA_REPORT -> {
                StaticDataReport staticDataReport =
                        aisStreamMessage.getMessage().getStaticDataReport();
                yield staticDataReport != null
                        ? staticDataReport.getReportA().getName().trim()
                        : null;
            }
            default -> null;
        };
    }

    private String getDestination(AisStreamMessage aisStreamMessage) {
        ShipStaticData shipStaticData = aisStreamMessage.getMessage().getShipStaticData();
        return shipStaticData != null ? shipStaticData.getDestination().trim() : null;
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

        int month = shipStaticData.getEta().getMonth();
        int day = shipStaticData.getEta().getDay();
        int hour = shipStaticData.getEta().getHour() - 1;
        int minute = shipStaticData.getEta().getMinute() - 1;

        // AIS ETA is expressed in UTC
        ZoneId utcZone = ZoneId.of("UTC");
        int currentYear = Year.now(utcZone).getValue();
        ZonedDateTime etaDateTime;
        try {
            etaDateTime = ZonedDateTime.of(currentYear, month, day, hour, minute, 0, 0, utcZone);
        } catch (DateTimeException e) {
            // Invalid date, assume no ETA available
            return null;
        }

        // If the constructed ETA is before now (in UTC), assume the ETA refers to the next year
        if (etaDateTime.isBefore(ZonedDateTime.now(utcZone))) {
            etaDateTime = etaDateTime.plusYears(1);
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
