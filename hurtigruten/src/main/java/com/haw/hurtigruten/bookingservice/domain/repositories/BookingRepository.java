package com.haw.hurtigruten.bookingservice.domain.repositories;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingCode;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookingRepository implements PanacheRepository<Booking> {

    public Optional<Booking> findByBookingCode(BookingCode bookingCode) {
        return find("bookingCode", bookingCode).firstResultOptional();
    }

    public List<Booking> findConfirmedBookings(Long customerId) {
        return find("SELECT b FROM Booking b, Customer c WHERE c.id = ?1 AND b member of c.bookings " +
                "AND b.bookingStatus = com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus.CONFIRMED", customerId).list();
    }
}
