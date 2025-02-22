package com.haw.hurtigruten.kafka.resource;

import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.openapitools.client.model.AisStreamMessage;

@Getter
@ApplicationScoped
public class GeoDataProcessor {

    @Channel("ais-messages-raw")
    Multi<AisStreamMessage> aisStreamMessages;
}
