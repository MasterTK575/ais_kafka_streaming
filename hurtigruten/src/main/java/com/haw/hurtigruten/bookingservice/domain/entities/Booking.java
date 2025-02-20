package com.haw.hurtigruten.bookingservice.domain.entities;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.datatypes.CheckInStatus;
import com.haw.hurtigruten.bookingservice.domain.dtos.BookingCreateDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    @Setter(AccessLevel.NONE)
    private final Date createdOn = new Date();

    private Date lastUpdatedOn;

    private String ferry;

    @Setter(AccessLevel.NONE)
    private BookingStatus bookingStatus = BookingStatus.UNCONFIRMED;

    @Setter(AccessLevel.NONE)
    private CheckInStatus checkinStatus = CheckInStatus.NOT_CHECKED_IN;

    @Version
    private Long version;

    public Booking(String ferry) {
        this.ferry = ferry;
        this.lastUpdatedOn = new Date();
    }

    public static Booking of(BookingCreateDTO bookingCreateDTO) {
        return new Booking(bookingCreateDTO.ferry);
    }

    public void updateBookingStatus(BookingStatus newStatus) {
        bookingStatus = bookingStatus.transition(newStatus);
        lastUpdatedOn = new Date();
    }

    public void updateCheckInStatus(CheckInStatus newStatus) {
        checkinStatus = checkinStatus.transition(newStatus);
        lastUpdatedOn = new Date();
    }
}
