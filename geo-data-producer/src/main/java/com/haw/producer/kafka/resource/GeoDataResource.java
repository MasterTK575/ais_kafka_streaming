package com.haw.producer.kafka.resource;

import com.haw.producer.kafka.model.GeoData;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class GeoDataResource {

    @Channel("geo-data")
    Emitter<GeoData> geoDataEmitter;

    public GeoData produceGeoData() {
        GeoData geoData = new GeoData(5L, "123.456", "789.012");
        geoDataEmitter.send(geoData);
        return geoData;
    }
}
