package com.haw.hurtigruten.bookingservice.api;

import com.haw.hurtigruten.kafka.resource.AisDataConsumer;
import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.openapitools.client.custom.AisStreamAggregation;
import org.openapitools.client.model.SubscriptionMessage;

@Path("/ais-stream")
public class AisStreamRestController {

    @Inject
    AisDataConsumer aisDataConsumer;

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<Record<Long, AisStreamAggregation>> getAisGeoDataStream() {
        return aisDataConsumer.getAisStreamMessages();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateAisStreamSubscription(SubscriptionMessage subscriptionMessage) {
        // TODO: maybe adjust subsciption message object
        // TODO: send message to producer via kafka
        // TODO this also starts the actual production of ais messages!!!
        // the get only "subscribes" to the processed topic we have
    }
}
