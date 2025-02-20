package com.haw.hurtigruten.portcheckinservice.exceptions;

import com.haw.hurtigruten.bookingservice.domain.datatypes.CheckInStatus;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
//@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidCheckInStatusException extends Exception {

    private final Long bookingId;

    private final CheckInStatus currentStatus;

    private final CheckInStatus requestedStatus;

    public InvalidCheckInStatusException(Long bookingId, CheckInStatus currentStatus, CheckInStatus requestedStatus) {
        super(String.format("Invalid status of booking with number %d. Current status is %s, requested status is %s.", bookingId, currentStatus.toString(), requestedStatus.toString()));

        this.bookingId = bookingId;
        this.currentStatus = currentStatus;
        this.requestedStatus = requestedStatus;
    }
}