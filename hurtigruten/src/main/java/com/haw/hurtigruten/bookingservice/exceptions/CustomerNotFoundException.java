package com.haw.hurtigruten.bookingservice.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class CustomerNotFoundException extends Exception {

    private final Long customerId;

    public CustomerNotFoundException(Long customerId) {
        super(String.format("Could not find customer with numer %d.", customerId));

        this.customerId = customerId;
    }
}