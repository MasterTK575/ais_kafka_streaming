package com.haw.hurtigruten.portcheckinservice.api;

import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.domain.repositories.BookingRepository;
import com.haw.hurtigruten.bookingservice.services.BookingService;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
@Transactional
class CheckInOutRestControllerTest {


    @Inject
    BookingRepository bookingRepository;

    @Inject
    BookingService bookingService;

    private Booking confirmedBooking, unconfirmedBooking;

    @BeforeEach
    @Transactional
    void setUp() {
        this.bookingRepository.deleteAll();

        confirmedBooking = new Booking("Mein Hybrid-Schiff");
        this.bookingRepository.persist(confirmedBooking);
        assertThatCode(() -> {
            bookingService.confirmBooking(confirmedBooking.getId());
        }).doesNotThrowAnyException();

        unconfirmedBooking = new Booking("Mein Hybrid-Schiff");
        this.bookingRepository.persistAndFlush(unconfirmedBooking);
    }

    @Test
    void checkInBookingSuccess() {
        //@formatter:off
        given().
        when().
                post("/checkin/{id}", confirmedBooking.getId()).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @Test
    void checkInBookingFailBecauseOfNotFound() {
        //@formatter:off
        given().
        when().
                post("/checkin/{id}", Long.MAX_VALUE).
        then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }

    @Test
    void checkInBookingFailBecauseOfInvalidStatus() {
        //@formatter:off
        given().
        when().
                post("/checkin/{id}", unconfirmedBooking.getId()).
        then().
                statusCode(Response.Status.BAD_REQUEST.getStatusCode());
        //@formatter:on
    }

    @Test
    void checkOutBookingSuccess() {
        //@formatter:off
        given().
        when().
                post("/checkin/{id}", confirmedBooking.getId()).
        then().
                statusCode(Response.Status.OK.getStatusCode());

        given().
        when().
                post("/checkout/{id}", confirmedBooking.getId()).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @Test
    void checkOutBookingFailBecauseOfNotFound() {
        //@formatter:off
        given().
        when().
                post("/checkout/{id}", Long.MAX_VALUE).
        then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }

    @Test
    void checkOutBookingFailBecauseOfInvalidStatus() {
        //@formatter:off
        given().
        when().
                post("/checkout/{id}", unconfirmedBooking.getId()).
        then().
                statusCode(Response.Status.BAD_REQUEST.getStatusCode()).
                body(containsString("NOT_CHECKED_IN"));

        given().
        when().
                post("/checkout/{id}", confirmedBooking.getId()). // confirmed but not checked in
        then().
                statusCode(Response.Status.BAD_REQUEST.getStatusCode()).
                body(containsString("NOT_CHECKED_IN"));
        //@formatter:on
    }
}