package com.haw.hurtigruten.aisstream.api;

import com.haw.hurtigruten.aisstream.gateway.AisStreamSubscriptionGateway;
import com.haw.hurtigruten.aisstream.resource.AisDataConsumer;
import io.smallrye.mutiny.Multi;
import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import org.jboss.resteasy.reactive.RestStreamElementType;
import org.openapitools.client.custom.AisShipData;
import org.openapitools.client.custom.SubscriptionAction;

/**
 * REST endpoint for streaming AIS data.
 */
@Path("/ais-stream")
@RequiredArgsConstructor
public class AisStreamRestController {

    private final AisDataConsumer aisDataConsumer;
    private final AisStreamSubscriptionGateway aisStreamSubscriptionGateway;

    /**
     * Expose a server-sent event stream of processed AIS data.
     * It uses the {@link AisDataConsumer} to get the AIS data stream sends it to the client.
     * @return a stream of AIS data
     */
    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS) // not strictly necessary when using @RestStreamElementType
    @RestStreamElementType(MediaType.APPLICATION_JSON)
    public Multi<AisShipData> getAisGeoDataStream() {
        return aisDataConsumer.getAisStreamMessages().map(Record::value);
    }

    /**
     * Set or update an AIS stream subscription.
     * @param subscriptionAction the subscription action
     * @return ok if the subscription was set or updated
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setOrUpdateAisStreamSubscription(SubscriptionAction subscriptionAction) {
        this.aisStreamSubscriptionGateway.emit(subscriptionAction);
        return Response.ok().build();
    }
}
