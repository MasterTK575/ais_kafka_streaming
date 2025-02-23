package com.haw.processor.kafka.streams;

import io.quarkus.kafka.client.serialization.ObjectMapperSerde;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;
import org.openapitools.client.custom.AisStreamAggregation;
import org.openapitools.client.custom.PositionInformation;
import org.openapitools.client.model.*;

@ApplicationScoped
public class TopologyProducer {

    public static final String AIS_MESSAGES_STORE = "ais-messages-store";
    private static final String AIS_MESSAGES_RAW_TOPIC = "ais-messages-raw";
    private static final String AIS_MESSAGES_PROCESSED_TOPIC = "ais-messages-processed";

    @Produces
    public Topology buildTopology() {
        StreamsBuilder builder = new StreamsBuilder();

        ObjectMapperSerde<AisStreamMessage> aisStreamMessageSerde = new ObjectMapperSerde<>(AisStreamMessage.class);
        ObjectMapperSerde<AisStreamAggregation> aisStreamAggregationSerde =
                new ObjectMapperSerde<>(AisStreamAggregation.class);
        KeyValueBytesStoreSupplier storeSupplier = Stores.persistentKeyValueStore(AIS_MESSAGES_STORE);

        builder.stream(AIS_MESSAGES_RAW_TOPIC, Consumed.with(Serdes.Long(), aisStreamMessageSerde))
                .groupByKey()
                .aggregate(
                        AisStreamAggregation::new,
                        (MMSI, aisStreamMessage, aisStreamAggregation) -> aisStreamAggregation.updateFrom(
                                MMSI, aisStreamMessage, this.getPositionInformation(aisStreamMessage)),
                        Materialized.<Long, AisStreamAggregation>as(storeSupplier)
                                .withKeySerde(Serdes.Long())
                                .withValueSerde(aisStreamAggregationSerde))
                .toStream()
                .to(AIS_MESSAGES_PROCESSED_TOPIC, Produced.with(Serdes.Long(), aisStreamAggregationSerde));

        return builder.build();
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
                                positionReport.getCog(),
                                positionReport.getSog(),
                                positionReport.getTrueHeading(),
                                positionReport.getTimestamp())
                        : null;
            }
            case AisMessageTypes.STANDARD_CLASS_B_POSITION_REPORT -> {
                StandardClassBPositionReport standardClassBPositionReport =
                        aisStreamMessage.getMessage().getStandardClassBPositionReport();
                yield standardClassBPositionReport != null
                        ? new PositionInformation(
                                standardClassBPositionReport.getLatitude(),
                                standardClassBPositionReport.getLongitude(),
                                standardClassBPositionReport.getCog(),
                                standardClassBPositionReport.getSog(),
                                standardClassBPositionReport.getTrueHeading(),
                                standardClassBPositionReport.getTimestamp())
                        : null;
            }
            case AisMessageTypes.EXTENDED_CLASS_B_POSITION_REPORT -> {
                ExtendedClassBPositionReport extendedClassBPositionReport =
                        aisStreamMessage.getMessage().getExtendedClassBPositionReport();
                yield extendedClassBPositionReport != null
                        ? new PositionInformation(
                                extendedClassBPositionReport.getLatitude(),
                                extendedClassBPositionReport.getLongitude(),
                                extendedClassBPositionReport.getCog(),
                                extendedClassBPositionReport.getSog(),
                                extendedClassBPositionReport.getTrueHeading(),
                                extendedClassBPositionReport.getTimestamp())
                        : null;
            }
            default -> null;
        };
    }
}
