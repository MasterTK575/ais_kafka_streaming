package com.haw.hurtigruten.messaging.events;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@RegisterForReflection
public abstract class BookingEvent extends Event {

    private Long bookingId;

    @Override
    public String toString() {
        return String.format("%s(id=%s)", this.getClass().getSimpleName(), this.getBookingId());
    }
}
