package com.haw.hurtigruten.aisstream.resource;

import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.openapitools.client.custom.AisShipData;

/**
 * Consumes AIS data from the ais-ship-data channel and exposes it as a stream.
 */
@Getter
@ApplicationScoped
public class AisDataConsumer {

    @Channel("ais-ship-data")
    Multi<Record<Long, AisShipData>> aisStreamMessages;
}
