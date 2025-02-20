package com.haw.hurtigruten.bookingservice.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class BookingNotConfirmedException extends Exception {

    private final Long bookingId;

    public BookingNotConfirmedException(Long bookingId) {
        super(String.format("Booking with number %d was not confirmed.", bookingId));
        this.bookingId = bookingId;
    }
}