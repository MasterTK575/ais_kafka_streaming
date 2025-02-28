package com.haw.processor.kafka.streams;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.errors.InvalidStateStoreException;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.openapitools.client.custom.AisStreamAggregation;

import java.util.Optional;

/**
 * This class is used to query the materialized state store for aggregated AIS data.
 */
@ApplicationScoped
@RequiredArgsConstructor
public class AisAggregationQuery {

    private final KafkaStreams streams;

    /**
     * Get the aggregated AIS data for a specific ship.
     * @param mmsi the MMSI of the ship
     * @return the aggregated AIS data
     */
    public Optional<AisStreamAggregation> getAisStreamAggregation(long mmsi) {
        ReadOnlyKeyValueStore<Long, AisStreamAggregation> aisAggregationStore = this.getAisAggregationStore();
        if (aisAggregationStore == null) {
            return Optional.empty();
        }
        AisStreamAggregation result = aisAggregationStore.get(mmsi);
        return Optional.ofNullable(result);
    }

    /**
     * Get the AIS aggregation store from the Kafka Streams instance based on our custom store name.
     * @return the AIS aggregation store
     */
    private ReadOnlyKeyValueStore<Long, AisStreamAggregation> getAisAggregationStore() {
        try {
            return streams.store(StoreQueryParameters.fromNameAndType(
                    AisDataStreamTopology.AIS_AGGREGATION_STORE, QueryableStoreTypes.keyValueStore()));
        } catch (InvalidStateStoreException e) {
            Log.error("Error while accessing store", e);
            return null;
        }
    }
}
