package com.haw.hurtigruten.util;

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
            case ConstraintViolationException e -> {
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity(e.toString())
                        .build();
            }
            case NotFoundException e -> {
                Log.debug(exception);
                return Response.status(Response.Status.NOT_FOUND)
                        .entity(e.toString())
                        .build();
            }
            default -> {
                Log.error(exception);
                return Response.status(Response.Status.SERVICE_UNAVAILABLE)
                        .entity(exception.toString())
                        .build();
            }
        }
    }
}
