package com.haw.hurtigruten.bookingservice.services;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.domain.repositories.BookingRepository;
import com.haw.hurtigruten.bookingservice.domain.repositories.CustomerRepository;
import com.haw.hurtigruten.bookingservice.exceptions.BookingAlreadyConfirmedException;
import com.haw.hurtigruten.bookingservice.exceptions.BookingNotConfirmedException;
import com.haw.hurtigruten.bookingservice.exceptions.BookingNotFoundException;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@QuarkusTest
@Transactional
class BookingServiceTest {

    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private BookingRepository bookingRepository;

    @Inject
    private BookingService bookingService;

    private Booking confirmedBooking;

    @BeforeEach
    @Transactional
    public void setUp() {
        this.customerRepository.deleteAll();
        this.bookingRepository.deleteAll();
        confirmedBooking = new Booking("Mein Hybrid-Schiff");
        this.bookingRepository.persist(confirmedBooking);
        assertThatCode(() -> {
            bookingService.confirmBooking(confirmedBooking.getId());
        }).doesNotThrowAnyException();
    }

    @Test
    void updateBookingStatusFailsCorrectly() {
        Booking notConfirmedBooking = new Booking("Mein Diesel-Schiff");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    notConfirmedBooking.updateBookingStatus(BookingStatus.CLOSED);
                });
    }

    @Test
    void getBookingByIdSuccess() {
        assertThatCode(() -> bookingService.getBookingById(confirmedBooking.getId())).doesNotThrowAnyException();
    }

    @Test
    void getBookingByIdFailBecauseOfNotFound() {
        assertThatExceptionOfType(BookingNotFoundException.class)
                .isThrownBy(() -> {
                    bookingService.getBookingById(Long.MAX_VALUE);
                });
    }

    @Test
    void checkInSuccess() throws BookingNotFoundException, BookingAlreadyConfirmedException {
        assertThatCode(() -> {
            bookingService.checkIn(confirmedBooking.getId());
        }).doesNotThrowAnyException();
    }

    @Test
    void checkInFailBecauseOfNotConfirmed() {
        Booking notConfirmedBooking = new Booking("Mein Diesel-Schiff");
        this.bookingRepository.persist(notConfirmedBooking);
        assertThatExceptionOfType(BookingNotConfirmedException.class)
                .isThrownBy(() -> {
                    bookingService.checkIn(notConfirmedBooking.getId());
                });
    }

    @Test
    void checkOutSuccess() {
        assertThatCode(() -> {
            bookingService.checkIn(confirmedBooking.getId());
        }).doesNotThrowAnyException();
        assertThatCode(() -> {
            bookingService.checkOut(confirmedBooking.getId());
        }).doesNotThrowAnyException();
    }
}