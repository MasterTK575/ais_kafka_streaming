package com.haw.hurtigruten.kafka.resource;

import com.haw.hurtigruten.kafka.model.GeoData;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;

@ApplicationScoped
public class GeoDataProcessor {

    @Channel("geo-data")
    Multi<GeoData> geoDataStream;

    public Multi<GeoData> getGeoDataStream() {
        return geoDataStream;
    }
}
