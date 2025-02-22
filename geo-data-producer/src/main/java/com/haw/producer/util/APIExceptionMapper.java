package com.haw.producer.util;

import com.haw.producer.ais.exceptions.NoAisStreamConnectionException;
import io.quarkus.logging.Log;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.net.URISyntaxException;

@Provider
public class APIExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        switch (exception) {
            case NotFoundException e -> {
                Log.debug(e);
                return Response.status(Response.Status.NOT_FOUND).entity(e.toString()).build();
            }
            case URISyntaxException e -> {
                Log.error(e);
                return Response.status(Response.Status.SERVICE_UNAVAILABLE).entity(e.toString()).build();
            }
            case NoAisStreamConnectionException e -> {
                Log.error(e);
                return Response.status(Response.Status.BAD_REQUEST).entity(e.toString()).build();
            }
            default -> {
                Log.error(exception);
                return Response.status(Response.Status.SERVICE_UNAVAILABLE).entity(exception.toString()).build();
            }
        }
    }
}
