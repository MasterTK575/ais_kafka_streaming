package com.haw.processor.kafka.streams;

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

import io.quarkus.kafka.client.serialization.ObjectMapperSerde;
import org.openapitools.client.custom.AisStreamAggregation;
import org.openapitools.client.model.AisStreamMessage;

@ApplicationScoped
public class TopologyProducer {

    public static final String AIS_MESSAGES_STORE = "ais-messages-store";
    private static final String AIS_MESSAGES_RAW_TOPIC = "ais-messages-raw";
    private static final String AIS_MESSAGES_PROCESSED_TOPIC = "ais-messages-processed";

    @Produces
    public Topology buildTopology() {
        StreamsBuilder builder = new StreamsBuilder();

        ObjectMapperSerde<AisStreamMessage> aisStreamMessageSerde = new ObjectMapperSerde<>(
                AisStreamMessage.class);
         ObjectMapperSerde<AisStreamAggregation> aisStreamAggregationSerde = new ObjectMapperSerde<>(AisStreamAggregation.class);

        KeyValueBytesStoreSupplier storeSupplier = Stores.persistentKeyValueStore(
                AIS_MESSAGES_STORE);

        // Use if global table for joins etc. ist needed
        // maybe for all ship ids
//        GlobalKTable<Integer, WeatherStation> stations = builder.globalTable(
//                WEATHER_STATIONS_TOPIC,
//                Consumed.with(Serdes.Integer(), weatherStationSerde));

        builder.stream(
                        AIS_MESSAGES_RAW_TOPIC,
                        Consumed.with(Serdes.Long(), aisStreamMessageSerde)
                ).peek((key, value) -> System.out.println("MMSI: " + key + " Message: " + value))
                .filter((key, value) -> key != null) // in case we couldn't extract the MMSI
                .groupByKey()
                .aggregate(
                        AisStreamAggregation::new,
                        (MMSI, aisStreamMessage, aisStreamAggregation)
                                -> aisStreamAggregation.updateFrom(MMSI, aisStreamMessage),
                        Materialized.<Long, AisStreamAggregation> as(storeSupplier)
                                .withKeySerde(Serdes.Long())
                                .withValueSerde(aisStreamAggregationSerde)
                )
                .toStream()
                .to(
                        AIS_MESSAGES_PROCESSED_TOPIC,
                        Produced.with(Serdes.Long(), aisStreamAggregationSerde)
                );

        return builder.build();
    }
}
