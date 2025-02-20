package com.haw.hurtigruten.bookingservice.domain;

import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BookingCodeTest {

    private ArrayList<String> codes = new ArrayList<>();

    @Test
    void createBookingCodeSuccess() {
        Assertions.assertThat(new Booking("Mein Schiff").getBookingCode().getCode()).containsPattern(Pattern.compile("[0-9A-Z]{6,6}"));
    }

    // just for fun, not really useful
    @RepeatedTest(50)
    void createUniqueBookingCodeSuccess() {
        String code = new Booking("Mein Schiff").getBookingCode().getCode();
        assertThat(codes.contains(code)).isFalse();
        codes.add(code);
    }
}
