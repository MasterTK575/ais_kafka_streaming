package com.haw.hurtigruten.bookingservice.domain.repositories;

import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

    public Optional<Customer> findByLastName(String lastName) {
        return find("lastName", lastName).firstResultOptional();
    }

    //Optional<Customer> findByBookingsContaining(Booking booking);
}
