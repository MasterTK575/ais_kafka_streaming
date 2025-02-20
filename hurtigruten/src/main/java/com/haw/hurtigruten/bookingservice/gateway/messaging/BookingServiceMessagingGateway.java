package com.haw.hurtigruten.bookingservice.gateway.messaging;

import com.haw.hurtigruten.bookingservice.exceptions.BookingNotConfirmedException;
import com.haw.hurtigruten.bookingservice.exceptions.BookingNotFoundException;
import com.haw.hurtigruten.bookingservice.services.BookingService;
import com.haw.hurtigruten.messaging.events.CheckInEvent;
import com.haw.hurtigruten.messaging.events.CheckOutEvent;
import com.haw.hurtigruten.messaging.events.Event;
import com.haw.hurtigruten.portcheckinservice.exceptions.InvalidCheckInStatusException;
import io.quarkus.logging.Log;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;

/**
 * Implements the Messaging Gateway Pattern
 *
 * @see <a href="https://www.enterpriseintegrationpatterns.com/patterns/messaging/MessagingGateway.html">Messaging Gateway Pattern</a>
 */
@ApplicationScoped
public class BookingServiceMessagingGateway {

    @Inject
    @Channel("com-haw-hurtigruten-outgoing-booking")
    Emitter<Event> bookingEventEmitter;

    @Inject
    BookingService bookingService;

    @Incoming("com-haw-hurtigruten-incoming-portcheckin")
    @Transactional
    public void consume(JsonObject p) {
        Event event;
        try {
            event = p.mapTo(Event.class);
        } catch (Exception e) {
            Log.error("Unable to deserialize event: " + p);
            throw e;
        }

        try {
            handleEvent(event);
            Log.info("Event has been processed");
        } catch (Exception e) {
            Log.error("Error processing event: " + event, e);
            // TODO: Send error event with correct booking info back to port
        }
    }

    private void handleEvent(Event event) throws BookingNotFoundException, BookingNotConfirmedException, InvalidCheckInStatusException {
        switch (event) {
            case CheckInEvent checkInEvent -> bookingService.checkIn(checkInEvent.getBookingId());
            case CheckOutEvent checkOutEvent -> bookingService.checkOut(checkOutEvent.getBookingId());
            default -> Log.warn("Event type not supported. Ignoring event.");
        }
    }

    public void publish(Event event) {
        Log.info("Publishing event: " + event);
        bookingEventEmitter
                .send(event)
                .toCompletableFuture()
                .join();
    }
}
