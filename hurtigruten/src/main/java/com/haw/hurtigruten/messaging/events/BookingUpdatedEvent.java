package com.haw.hurtigruten.messaging.events;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.datatypes.CheckInStatus;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@RegisterForReflection
public class BookingUpdatedEvent extends BookingEvent {

    private BookingStatus bookingStatus;
    private CheckInStatus checkinStatus;

    public BookingUpdatedEvent(Long bookingId, BookingStatus bookingStatus, CheckInStatus checkinStatus) {
        super(bookingId);
        this.bookingStatus = bookingStatus;
        this.checkinStatus = checkinStatus;
    }
}
