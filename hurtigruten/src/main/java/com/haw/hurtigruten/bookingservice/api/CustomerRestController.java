package com.haw.hurtigruten.bookingservice.api;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import com.haw.hurtigruten.bookingservice.domain.dtos.CustomerCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.CustomerUpdateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.IdDTO;
import com.haw.hurtigruten.bookingservice.domain.entities.Booking;
import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
import com.haw.hurtigruten.bookingservice.domain.repositories.CustomerRepository;
import com.haw.hurtigruten.bookingservice.exceptions.CustomerNotFoundException;
import com.haw.hurtigruten.bookingservice.services.BookingService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;

@Path("/customers")
@Tag(name = "/customers", description = "Customers")
@Transactional
public class CustomerRestController {

    @Inject
    BookingService bookingService;
    @Inject
    CustomerRepository customerRepository;

    @Operation(description = "Get all customers")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully retrieved customers"),
    })
    @GET
    public List<Customer> getCustomers() {
        return customerRepository.findAll().list();
    }

    @Operation(description = "Get a customer by Id")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully retrieved customer"),
            @APIResponse(responseCode = "404", description = "Customer not found")
    })
    @Path("/{customerId:[\\d]+}")
    @GET
    public Customer getCustomer(Long customerId) throws CustomerNotFoundException {
        return customerRepository
                .findByIdOptional(customerId)
                .orElseThrow(() -> new CustomerNotFoundException(customerId));
    }

    @Operation(description = "Get bookings of a customer")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully retrieved bookings for customer"),
            @APIResponse(responseCode = "404", description = "Customer not found")
    })
    @Path("/{customerId:[\\d]+}/bookings")
    @GET
    public List<Booking> getBookingsOfCustomer(Long customerId) throws CustomerNotFoundException {
        return bookingService.getBookingsByCustomer(customerId);
    }

    @Operation(description = "Delete a customer by Id")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully deleted customer"),
            @APIResponse(responseCode = "404", description = "Customer not found")
    })
    @Path("/{customerId:[\\d]+}")
    @DELETE
    public Response deleteCustomer(Long customerId) throws CustomerNotFoundException {
        Customer customer = customerRepository
                .findByIdOptional(customerId)
                .orElseThrow(() -> new CustomerNotFoundException(customerId));

        customerRepository.delete(customer);

        return Response.ok().entity(customerId + " deleted.").build();
    }

    @Operation(description = "Create a customer")
    @APIResponses(value = {
            @APIResponse(responseCode = "201", description = "Successfully created customer")
    })
    @POST
    public Response addCustomer(@Valid CustomerCreateDTO customerCreateDTO) {
        Customer customer = Customer.of(customerCreateDTO);
        customerRepository.persist(customer);

        return Response.status(Response.Status.CREATED)
                .entity(new IdDTO(customer.getId()))
                .build();
    }

    @Operation(description = "Update a customer")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Successfully updated customer"),
            @APIResponse(responseCode = "404", description = "Customer not found")
    })
    @PUT
    public Response updateCustomer(@Valid CustomerUpdateDTO customerUpdateDTO) throws CustomerNotFoundException {
        Customer customerToUpdate = customerRepository
                .findByIdOptional(customerUpdateDTO.getId())
                .orElseThrow(() -> new CustomerNotFoundException(customerUpdateDTO.getId()));

        if (customerUpdateDTO.getEmail() != null) {
            customerToUpdate.setEmail(new Email(customerUpdateDTO.getEmail()));
        }
        if (customerUpdateDTO.getPhoneNumber() != null) {
            customerToUpdate.setPhoneNumber(new PhoneNumber(customerUpdateDTO.getPhoneNumber()));
        }

        customerRepository.persist(customerToUpdate);
        return Response.ok().entity(customerUpdateDTO.getId() + " updated.").build();
    }
}
