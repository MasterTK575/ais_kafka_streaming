package com.haw.hurtigruten.portcheckinservice.api;

import com.haw.hurtigruten.bookingservice.exceptions.BookingNotConfirmedException;
import com.haw.hurtigruten.bookingservice.exceptions.BookingNotFoundException;
import com.haw.hurtigruten.bookingservice.services.BookingService;
import com.haw.hurtigruten.portcheckinservice.domain.DTOs.GateBookingDto;
import com.haw.hurtigruten.portcheckinservice.exceptions.InvalidCheckInStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Tag(name = "/", description = "CheckInOut")
@Transactional
public class CheckInOutRestController {

    @Inject
    BookingService bookingService;

    @Operation(description = "CheckIn booking")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully checked in"),
            @APIResponse(responseCode = "400", description = "Invalid checkin- or booking-status"),
            @APIResponse(responseCode = "404", description = "Booking is not found")
    })
    @Path("/checkin/{bookingId:[\\d]+}")
    @POST
    public GateBookingDto checkIn(Long bookingId) throws BookingNotFoundException, BookingNotConfirmedException, InvalidCheckInStatusException {
        return bookingService.checkIn(bookingId);
    }

    @Operation(description = "CheckOut booking")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully checked out"),
            @APIResponse(responseCode = "400", description = "Invalid checkin- or booking-status"),
            @APIResponse(responseCode = "404", description = "Booking is not found")
    })
    @Path("/checkout/{bookingId:[\\d]+}")
    @POST
    public GateBookingDto checkOut(Long bookingId) throws BookingNotFoundException, InvalidCheckInStatusException {
        return bookingService.checkOut(bookingId);
    }
}
