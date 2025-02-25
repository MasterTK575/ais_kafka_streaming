package com.haw.producer.api;

import com.haw.producer.ais.client.AisStreamClient;
import com.haw.producer.ais.exceptions.NoAisStreamConnectionException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.openapitools.client.model.SubscriptionMessage;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

@Path("/produce")
@Tag(name = "/produce", description = "Produce Geo Data")
@Transactional
public class ProducerRestController {

    @Inject
    AisStreamClient aisStreamClient;

    @ConfigProperty(name = "AIS_STREAMS_API_KEY")
    String apiKey;

    // TODO: remove this class, producer service only needs to be available through kafka
    @Operation(description = "Request Production of Geo Data")
    @APIResponses(
            value = {
                @APIResponse(responseCode = "200", description = "Successfully produced geo data"),
            })
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void openConnection() throws URISyntaxException {
        this.aisStreamClient.connectToOrUpdateAisStream(new SubscriptionMessage()
                .apIKey(apiKey)
                .boundingBoxes(List.of(Arrays.asList(Arrays.asList(-90.0, -180.0), Arrays.asList(90.0, 180.0)))));
    }

    @Path("/close")
    @POST
    public Response closeConnection() throws NoAisStreamConnectionException {
        this.aisStreamClient.closeConnection();
        return Response.ok().build();
    }
}
