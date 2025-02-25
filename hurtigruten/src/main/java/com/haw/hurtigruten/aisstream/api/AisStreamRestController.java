package com.haw.hurtigruten.aisstream.api;

import com.haw.hurtigruten.aisstream.gateway.AisStreamSubscriptionGateway;
import com.haw.hurtigruten.kafka.resource.AisDataConsumer;
import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import org.jboss.resteasy.reactive.RestStreamElementType;
import org.openapitools.client.custom.AisStreamAggregation;
import org.openapitools.client.custom.SubscriptionAction;

@Path("/ais-stream")
@RequiredArgsConstructor
public class AisStreamRestController {

    private final AisDataConsumer aisDataConsumer;
    private final AisStreamSubscriptionGateway aisStreamSubscriptionGateway;

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS) // not strictly necessary when using @RestStreamElementType
    @RestStreamElementType(MediaType.APPLICATION_JSON)
    public Multi<AisStreamAggregation> getAisGeoDataStream() {
        return aisDataConsumer.getAisStreamMessages().map(Record::value);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setOrUpdateAisStreamSubscription(SubscriptionAction subscriptionAction) {
        this.aisStreamSubscriptionGateway.emit(subscriptionAction);
        return Response.ok().build();
    }
}
