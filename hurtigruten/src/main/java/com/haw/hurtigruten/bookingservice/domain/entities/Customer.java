package com.haw.hurtigruten.bookingservice.domain.entities;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import com.haw.hurtigruten.bookingservice.domain.datatypes.Gender;
import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import com.haw.hurtigruten.bookingservice.domain.dtos.CustomerCreateDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private Email email;

    private PhoneNumber phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Setter(AccessLevel.NONE)
    private List<Booking> bookings = new ArrayList<>();

    public Customer(String firstName, String lastName, Gender gender, Email email, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static Customer of(CustomerCreateDTO customerCreateDTO) {
        return new Customer(
                customerCreateDTO.getFirstName(),
                customerCreateDTO.getLastName(),
                customerCreateDTO.getGender(),
                customerCreateDTO.getEmail() != null ? new Email(customerCreateDTO.getEmail()) : null,
                customerCreateDTO.getPhoneNumber() != null ? new PhoneNumber(customerCreateDTO.getPhoneNumber()) : null);
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
}
