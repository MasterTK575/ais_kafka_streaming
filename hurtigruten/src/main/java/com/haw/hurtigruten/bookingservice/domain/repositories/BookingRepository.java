package com.haw.hurtigruten.bookingservice.domain.repositories;

import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookingRepository implements PanacheRepository<Booking> {}
