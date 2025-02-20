package com.haw.producer.util;

import io.quarkus.logging.Log;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class APIExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        switch (exception) {
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
