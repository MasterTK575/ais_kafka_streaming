package com.haw.processor.kafka.api;

import com.haw.processor.kafka.streams.AisAggregationQuery;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import org.openapitools.client.custom.AisStreamAggregation;

import java.util.Optional;

/**
 * REST endpoint for querying aggregated AIS data via the materialized state store.
 */
@RequiredArgsConstructor
@Path("/aggregation")
public class AisAggregationRestController {

    private final AisAggregationQuery aisAggregationQuery;

    /**
     * Get the aggregated AIS data for a specific ship.
     * @param mmsi the MMSI of the ship
     * @return the aggregated AIS data
     */
    @GET
    @Path("/{mmsi:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAisStreamAggregation(long mmsi) {
        Optional<AisStreamAggregation> aisStreamAggregation = aisAggregationQuery.getAisStreamAggregation(mmsi);

        if (aisStreamAggregation.isPresent()) {
            return Response.ok(aisStreamAggregation.get()).build();
        } else {
            return Response.status(
                            Response.Status.NOT_FOUND.getStatusCode(),
                            "No aggregation data for ship with mmsi: " + mmsi)
                    .build();
        }
    }
}
