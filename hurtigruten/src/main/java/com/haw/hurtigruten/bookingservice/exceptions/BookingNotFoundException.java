package com.haw.hurtigruten.bookingservice.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class BookingNotFoundException extends Exception {

    private final Long bookingNumber;

    public BookingNotFoundException(Long bookingId) {
        super(String.format("Could not find booking with number %d.", bookingId));
        this.bookingNumber = bookingId;
    }
}