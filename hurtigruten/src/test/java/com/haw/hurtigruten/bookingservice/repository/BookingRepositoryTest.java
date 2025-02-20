package com.haw.hurtigruten.bookingservice.repository;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import com.haw.hurtigruten.bookingservice.domain.datatypes.Gender;
import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
import com.haw.hurtigruten.bookingservice.domain.repositories.BookingRepository;
import com.haw.hurtigruten.bookingservice.domain.repositories.CustomerRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
@Transactional
class BookingRepositoryTest {
    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private BookingRepository bookingRepository;

    private Customer customer;

    @BeforeEach
    public void setUp() {
        this.customerRepository.deleteAll();
        this.bookingRepository.deleteAll();

        customer = new Customer("Stefan", "Sarstedt", Gender.MALE,
                new Email("stefan.sarstedt@haw-hamburg.de"),
                new PhoneNumber("+49-040-428758434"));
        this.customerRepository.persist(customer);
        Booking unconfirmedBooking = new Booking("Dein Schiff 1");
        customer.addBooking(unconfirmedBooking);
        Booking confirmedBooking = new Booking("Mein Schiff 2");
        confirmedBooking.updateBookingStatus(BookingStatus.CONFIRMED);
        customer.addBooking(confirmedBooking);

        customerRepository.persist(customer);
    }

    @Test
    void findConfirmedBookingsSuccess() {
        List<Booking> actual = bookingRepository.findConfirmedBookings(customer.getId());
        assertThat(actual).size().isEqualTo(1);
    }
}
