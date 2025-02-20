package com.haw.hurtigruten.bookingservice.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class MailNotSentException extends Exception {

    public MailNotSentException(String recipient) {
        super(String.format("Could not send mail to %s.", recipient));

    }
}