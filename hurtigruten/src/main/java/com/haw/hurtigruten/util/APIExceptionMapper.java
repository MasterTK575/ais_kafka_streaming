package com.haw.hurtigruten.util;

import com.haw.hurtigruten.bookingservice.exceptions.*;
import com.haw.hurtigruten.portcheckinservice.exceptions.InvalidCheckInStatusException;
import io.quarkus.logging.Log;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import javax.validation.ConstraintViolationException;

@Provider
public class APIExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        switch (exception) {
            case BookingNotFoundException e -> {
                return Response.status(Response.Status.NOT_FOUND).entity(exception.toString()).build();
            }
            case CustomerNotFoundException e -> {
                return Response.status(Response.Status.NOT_FOUND).entity(exception.toString()).build();
            }
            case BookingAlreadyConfirmedException e -> {
                return Response.status(Response.Status.BAD_REQUEST).entity(exception.toString()).build();
            }
            case BookingNotConfirmedException e -> {
                return Response.status(Response.Status.BAD_REQUEST).entity(exception.toString()).build();
            }
            case MailNotSentException e -> {
                return Response.status(Response.Status.BAD_REQUEST).entity(exception.toString()).build();
            }
            case InvalidCheckInStatusException e -> {
                return Response.status(Response.Status.BAD_REQUEST).entity(exception.toString()).build();
            }
            case ConstraintViolationException e -> {
                return Response.status(Response.Status.BAD_REQUEST).entity(exception.toString()).build();
            }
            case NotFoundException e -> {
                Log.debug(exception);
                return Response.status(Response.Status.NOT_FOUND).entity(exception.toString()).build();
            }
            default -> {
                Log.error(exception);
                return Response.status(Response.Status.SERVICE_UNAVAILABLE).entity(exception.toString()).build();
            }
        }
    }
}
