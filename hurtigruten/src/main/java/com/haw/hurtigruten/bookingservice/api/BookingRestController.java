package com.haw.hurtigruten.bookingservice.api;

import com.haw.hurtigruten.bookingservice.domain.dtos.BookingCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.IdDTO;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.exceptions.BookingAlreadyConfirmedException;
import com.haw.hurtigruten.bookingservice.exceptions.BookingNotFoundException;
import com.haw.hurtigruten.bookingservice.exceptions.CustomerNotFoundException;
import com.haw.hurtigruten.bookingservice.services.BookingService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;

@Path("/bookings")
@Tag(name = "/bookings", description = "Bookings")
@Transactional
public class BookingRestController {

    @Inject
    BookingService bookingService;

    @Operation(description = "Get all bookings")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully retrieved bookings"),
    })
    @GET
    public List<Booking> getBookings() {
        return bookingService.getAllBookings();
    }

    @Operation(description = "Get a single booking")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully retrieved booking"),
            @APIResponse(responseCode = "404", description = "Booking not found")
    })
    @Path("/{bookingId:[\\d]+}")
    @GET
    public Booking getBooking(Long bookingId) throws BookingNotFoundException {
        return bookingService.getBookingById(bookingId);
    }

    @Operation(description = "Add a booking to a customer")
    @APIResponses(value = {
            @APIResponse(responseCode = "201", description = "Successfully added booking to customer"),
            @APIResponse(responseCode = "404", description = "Customer is not found"),
            @APIResponse(responseCode = "400", description = "Invalid booking data")
    })
    @Path("/add/{customerId:[\\d]+}")
    @POST
    public Response addBooking(Long customerId, @Valid BookingCreateDTO bookingCreateDTO) throws CustomerNotFoundException {
        Booking booking = bookingService.addBooking(customerId, bookingCreateDTO);
        return Response.status(Response.Status.CREATED)
                .entity(new IdDTO(booking.getId()))
                .build();
    }

    @Operation(description = "Confirm a booking")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Booking successfully confirmed"),
            @APIResponse(responseCode = "400", description = "Booking was already confirmed"),
            @APIResponse(responseCode = "404", description = "Booking not found")
    })
    @Path("/{bookingId:[\\d]+}/confirm")
    @PUT
    public Response confirmBooking(Long bookingId) throws BookingNotFoundException, BookingAlreadyConfirmedException {
        bookingService.confirmBooking(bookingId);
        return Response.ok().build();
    }
}
