package com.haw.hurtigruten.bookingservice.services;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.datatypes.CheckInStatus;
import com.haw.hurtigruten.bookingservice.domain.dtos.BookingCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
import com.haw.hurtigruten.bookingservice.domain.repositories.BookingRepository;
import com.haw.hurtigruten.bookingservice.domain.repositories.CustomerRepository;
import com.haw.hurtigruten.bookingservice.exceptions.*;
import com.haw.hurtigruten.bookingservice.gateway.mail.BookingServiceMailGateway;
import com.haw.hurtigruten.bookingservice.gateway.messaging.BookingServiceMessagingGateway;
import com.haw.hurtigruten.messaging.events.BookingCreatedEvent;
import com.haw.hurtigruten.messaging.events.BookingUpdatedEvent;
import com.haw.hurtigruten.portcheckinservice.domain.DTOs.GateBookingDto;
import com.haw.hurtigruten.portcheckinservice.exceptions.InvalidCheckInStatusException;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
@Transactional
public class BookingService {

    @Inject
    CustomerRepository customerRepository;
    @Inject
    BookingRepository bookingRepository;
    @Inject
    BookingServiceMailGateway bookingServiceMailGateway;
    @Inject
    BookingServiceMessagingGateway bookingServiceMessagingGateway;

    public List<Booking> getBookings() {
        return bookingRepository.findAll().list();
    }

    public List<Booking> getBookings(Long customerId, Boolean onlyConfirmed) throws CustomerNotFoundException {
        Customer customer = customerRepository
                .findByIdOptional(customerId)
                .orElseThrow(() -> new CustomerNotFoundException(customerId));

        if (onlyConfirmed != null && onlyConfirmed) { // onlyConfirmed can be null!
            return bookingRepository.findConfirmedBookings(customerId);
        } else {
            return customer.getBookings();
        }
    }

    public Booking getBooking(Long bookingId) throws BookingNotFoundException {
        return bookingRepository.findByIdOptional(bookingId).orElseThrow(
                () -> new BookingNotFoundException(bookingId)
        );
    }

    @Transactional(rollbackOn = {CustomerNotFoundException.class})
    public Booking addBooking(Long customerId, BookingCreateDTO bookingCreateDTO) throws CustomerNotFoundException {
        Customer customer = customerRepository.findByIdOptional(customerId)
                .orElseThrow(() -> new CustomerNotFoundException(customerId));

        Booking booking = Booking.of(bookingCreateDTO);
        bookingRepository.persist(booking);

        customer.addBooking(booking);
        customerRepository.persist(customer);

        Log.info("New booking created with id " + booking.getId());
        return booking;
    }

    @Transactional(rollbackOn = {BookingNotFoundException.class, BookingAlreadyConfirmedException.class})
    public void confirmBooking(Long bookingId) throws BookingNotFoundException, BookingAlreadyConfirmedException {
        Booking booking = bookingRepository
                .findByIdOptional(bookingId)
                .orElseThrow(() -> new BookingNotFoundException(bookingId));

        if (booking.getBookingStatus() == BookingStatus.CONFIRMED) {
            throw new BookingAlreadyConfirmedException(bookingId);
        }

        // unchecked exceptions (which can be thrown here) cause a rollback in @Transactional() per default
        booking.updateBookingStatus(BookingStatus.CONFIRMED);
        bookingRepository.persist(booking);
        Log.info("Booking confirmed with id " + booking.getId());
    }

    @Transactional(rollbackOn = {BookingNotFoundException.class, BookingNotConfirmedException.class})
    public GateBookingDto checkIn(Long bookingId) throws BookingNotFoundException, BookingNotConfirmedException, InvalidCheckInStatusException {

        Booking booking = bookingRepository.findByIdOptional(bookingId)
                .orElseThrow(() -> new BookingNotFoundException(bookingId));

        if (booking.getBookingStatus() != BookingStatus.CONFIRMED) {
            throw new BookingNotConfirmedException(bookingId);
        }

        if (booking.getCheckinStatus() != CheckInStatus.NOT_CHECKED_IN) {
            throw new InvalidCheckInStatusException(bookingId, booking.getCheckinStatus(), CheckInStatus.CHECKED_IN);
        }

        booking.updateCheckInStatus(CheckInStatus.CHECKED_IN);
        bookingRepository.persist(booking);
        Log.info("CheckIn successful with bookingId " + bookingId);
        return GateBookingDto.of(booking);
    }

    @Transactional(rollbackOn = {BookingNotFoundException.class, BookingNotConfirmedException.class})
    public GateBookingDto checkOut(Long bookingId) throws BookingNotFoundException, InvalidCheckInStatusException {

        Booking booking = bookingRepository.findByIdOptional(bookingId)
                .orElseThrow(() -> new BookingNotFoundException(bookingId));

        if (booking.getCheckinStatus() != CheckInStatus.CHECKED_IN) {
            throw new InvalidCheckInStatusException(booking.getId(), booking.getCheckinStatus(), CheckInStatus.CHECKED_OUT);
        }

        booking.updateCheckInStatus(CheckInStatus.CHECKED_OUT);
        bookingRepository.persist(booking);
        Log.info("CheckOut successful with bookingId " + bookingId);
        return GateBookingDto.of(booking);
    }
}
