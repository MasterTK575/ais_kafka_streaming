package com.haw.hurtigruten.portcheckinservice.domain.DTOs;

import com.haw.hurtigruten.bookingservice.domain.datatypes.BookingStatus;
import com.haw.hurtigruten.bookingservice.domain.datatypes.CheckInStatus;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class GateBookingDto {

    private Long bookingId;

    private BookingStatus bookingStatus = BookingStatus.UNCONFIRMED;

    private CheckInStatus checkinStatus = CheckInStatus.NOT_CHECKED_IN;

    public static GateBookingDto of(Booking booking) {
        GateBookingDto gateBookingDto = new GateBookingDto();
        gateBookingDto.setBookingId(booking.getId());
        gateBookingDto.setBookingStatus(booking.getBookingStatus());
        gateBookingDto.setCheckinStatus(booking.getCheckinStatus());
        return gateBookingDto;
    }
}
