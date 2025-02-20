package com.haw.hurtigruten.bookingservice.domain.datatypes;

public enum CheckInStatus {
    NOT_CHECKED_IN, CHECKED_IN(NOT_CHECKED_IN), CHECKED_OUT(CHECKED_IN);

    private final CheckInStatus[] previousStates;

    CheckInStatus(CheckInStatus... state) {
        this.previousStates = state;
    }

    public CheckInStatus transition(CheckInStatus newState) {
        for (CheckInStatus previous : newState.previousStates) {
            if (this == previous) {
                return newState;
            }
        }
        throw new IllegalArgumentException(String.format("Illegal state transition from %s to %s.", this.toString(), newState.toString()));
    }
}
