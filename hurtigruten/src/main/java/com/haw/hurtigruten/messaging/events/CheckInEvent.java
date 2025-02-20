package com.haw.hurtigruten.messaging.events;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@RegisterForReflection
public class CheckInEvent extends Event {

    private Long bookingId;
}
