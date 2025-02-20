package com.haw.hurtigruten.bookingservice.domain.datatypes;

public enum BookingStatus {
    UNCONFIRMED, CONFIRMED(UNCONFIRMED), CLOSED(CONFIRMED);

    private final BookingStatus[] previousStates;

    BookingStatus(BookingStatus... state) {
        this.previousStates = state;
    }


    public BookingStatus transition(BookingStatus newState) {
        for (BookingStatus previous : newState.previousStates) {
            if (this == previous) {
                return newState;
            }
        }
        throw new IllegalArgumentException(String.format("Illegal state transition from %s to %s.", this.toString(), newState.toString()));
    }
}
