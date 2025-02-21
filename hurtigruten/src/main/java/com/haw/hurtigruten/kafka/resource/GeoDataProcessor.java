package com.haw.hurtigruten.kafka.resource;

import com.haw.hurtigruten.kafka.model.GeoData;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.reactive.messaging.Channel;

@Getter
@ApplicationScoped
public class GeoDataProcessor {

    @Channel("geo-data")
    Multi<GeoData> geoDataStream;

}
