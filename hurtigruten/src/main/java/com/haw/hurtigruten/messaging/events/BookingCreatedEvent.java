package com.haw.hurtigruten.messaging.events;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@RegisterForReflection
public class BookingCreatedEvent extends BookingEvent {

    public BookingCreatedEvent(Long bookingId) {
        super(bookingId);
    }
}
