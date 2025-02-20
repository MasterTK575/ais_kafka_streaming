package com.haw.hurtigruten.bookingservice.gateway.mail;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookingServiceMailGateway {

    public boolean sendMail(String to, String subject, String text) {
        try {
            // todo
        } catch (Exception ex) {
            // do some logging and handling here
            return false;
        }
        return true;
    }
}
