package com.haw.producer.api;

import com.haw.producer.kafka.model.GeoData;
import com.haw.producer.kafka.resource.GeoDataResource;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/produce")
@Tag(name = "/produce", description = "Produce Geo Data")
@Transactional
public class ProducerRestController {

    @Inject
    GeoDataResource geoDataResource;

    @Operation(description = "Request Production of Geo Data")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully produced geo data"),
    })
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public GeoData produceGeoData() {
        return geoDataResource.produceGeoData();
    }

}
