package com.haw.producer.kafka.model;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
@ToString
public class GeoData {
    private Long id;
    private String longitude;
    private String latitude;
}
