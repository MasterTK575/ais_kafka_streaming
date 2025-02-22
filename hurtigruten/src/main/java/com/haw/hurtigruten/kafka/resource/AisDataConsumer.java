package com.haw.hurtigruten.kafka.resource;

import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.openapitools.client.custom.AisStreamAggregation;

@Getter
@ApplicationScoped
public class AisDataConsumer {

    @Channel("ais-messages-processed")
    Multi<Record<Long, AisStreamAggregation>> aisStreamMessages;
}
