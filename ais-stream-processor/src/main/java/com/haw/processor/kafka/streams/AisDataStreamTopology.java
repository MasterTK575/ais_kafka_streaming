package com.haw.processor.kafka.streams;

import com.haw.processor.kafka.service.AisInformationExtractionService;
import io.quarkus.kafka.client.serialization.ObjectMapperSerde;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;
import org.openapitools.client.custom.AisShipData;
import org.openapitools.client.custom.AisStreamAggregation;
import org.openapitools.client.model.AisStreamMessage;

/**
 * This class is used to build the Kafka Streams topology for processing AIS data.
 */
@ApplicationScoped
@RequiredArgsConstructor
public class AisDataStreamTopology {

    public static final String AIS_AGGREGATION_STORE = "ais-aggregation-store";
    private static final String AIS_MESSAGES_RAW_TOPIC = "ais-messages-raw";
    private static final String AIS_SHIP_DATA_TOPIC = "ais-ship-data";
    private final AisInformationExtractionService aisInformationExtractionService;

    /**
     * Build the Kafka Streams topology for processing AIS data.
     * This topology reads raw AIS messages, aggregates them by MMSI, and extracts ship data.
     * @return the Kafka Streams topology
     */
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
                        (mmsi, aisStreamMessage, aisStreamAggregation) -> {
                            AisShipData shipData =
                                    this.aisInformationExtractionService.getShipData(mmsi, aisStreamMessage);
                            return aisStreamAggregation.updateFrom(mmsi, aisStreamMessage, shipData);
                        },
                        Materialized.<Long, AisStreamAggregation>as(storeSupplier)
                                .withKeySerde(Serdes.Long())
                                .withValueSerde(aisStreamAggregationSerde))
                .toStream()
                .map((mmsi, aisStreamAggregation) -> KeyValue.pair(mmsi, aisStreamAggregation.getMostRecentShipData()))
                .to(AIS_SHIP_DATA_TOPIC, Produced.with(Serdes.Long(), aisShipDataSerde));

        return builder.build();
    }
}
