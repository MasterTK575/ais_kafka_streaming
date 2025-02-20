package com.haw.hurtigruten.bookingservice.api;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import com.haw.hurtigruten.bookingservice.domain.datatypes.Gender;
import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import com.haw.hurtigruten.bookingservice.domain.dtos.BookingCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.IdDTO;
import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
import com.haw.hurtigruten.bookingservice.domain.repositories.BookingRepository;
import com.haw.hurtigruten.bookingservice.domain.repositories.CustomerRepository;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
class BookingRestControllerTest {

    @Inject
    CustomerRepository customerRepository;
    @Inject
    BookingRepository bookingRepository;
    @TestHTTPEndpoint(BookingRestController.class)
    @TestHTTPResource
    private URL bookingRestControllerURL;

    private Customer customer;

    @BeforeEach
    @Transactional
    void setUp() {
        this.customerRepository.deleteAll();
        this.bookingRepository.deleteAll();

        customer = new Customer("Stefan", "Sarstedt", Gender.MALE,
                new Email("stefan.sarstedt@haw-hamburg.de"),
                new PhoneNumber("+49-040-428758434"));
        this.customerRepository.persist(customer);
    }

    // -------------------------------------------------------------------------------------------------------------------
    // für JSONPath siehe http://goessner.net/articles/JsonPath/ und den Tester unter https://jsonpath.curiousconcept.com/
    // -------------------------------------------------------------------------------------------------------------------
    @Test
    void getNoBookingsFoundSuccess() {
        //@formatter:off
        given().
        when().
                get(bookingRestControllerURL).
        then().
                statusCode(Response.Status.OK.getStatusCode()).
                body("", hasSize(0));
        //@formatter:on
    }

    @Test
    void getBookingFailBecauseOfNotFound() {
        //@formatter:off
        given().
        when().
                get(bookingRestControllerURL+ "/{id}", Integer.MAX_VALUE).
        then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }

    @Test
    void createGetBookingSuccess() {
        //@formatter:off
        Long bookingId = given().
                contentType(ContentType.JSON).
                body(new BookingCreateDTO("Mein Schiff 42")).
        when().
                post(bookingRestControllerURL + "/add/{id}", customer.getId()).
        then().
                statusCode(Response.Status.CREATED.getStatusCode()).
        extract().
                body().as(IdDTO.class).getId();

        given().
        when().
                get(bookingRestControllerURL).
        then().
                statusCode(Response.Status.OK.getStatusCode()).
                body("id", hasItem(bookingId.intValue()));

        given().
        when().
                get(bookingRestControllerURL + "/{id}", bookingId).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @Test
    void confirmBookingSuccess() {
        //@formatter:off
        Long bookingId = given().
                contentType(ContentType.JSON).
                body(new BookingCreateDTO("Mein Schiff 42")).
        when().
                post(bookingRestControllerURL + "/add/{id}", customer.getId()).
        then().
                statusCode(Response.Status.CREATED.getStatusCode()).
        extract().
                body().as(IdDTO.class).getId();

        given().
        when().
                put(bookingRestControllerURL + "/{id}/confirm", bookingId).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @Test
    void addBookingToCustomerFailBecauseOfCustomerNotFound() {
        //@formatter:off
        given().
                contentType(ContentType.JSON).
                body(new BookingCreateDTO("some ship")).
                when().
                post(bookingRestControllerURL + "/add/{id}", Integer.MAX_VALUE).
                then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }
}