package com.haw.hurtigruten.bookingservice.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class BookingAlreadyConfirmedException extends Exception {

    private final Long bookingId;

    public BookingAlreadyConfirmedException(Long bookingId) {
        super(String.format("Booking with number %d was already confirmed.", bookingId));

        this.bookingId = bookingId;
    }
}