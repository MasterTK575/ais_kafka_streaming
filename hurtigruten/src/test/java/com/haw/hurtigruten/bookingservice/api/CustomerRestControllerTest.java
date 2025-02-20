package com.haw.hurtigruten.bookingservice.api;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import com.haw.hurtigruten.bookingservice.domain.datatypes.Gender;
import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import com.haw.hurtigruten.bookingservice.domain.dtos.BookingCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.CustomerCreateDTO;
import com.haw.hurtigruten.bookingservice.domain.dtos.CustomerUpdateDTO;
import com.haw.hurtigruten.bookingservice.domain.entities.Customer;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.net.URL;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@QuarkusTest
class CustomerRestControllerTest {

    @Inject
    CustomerRepository customerRepository;
    @TestHTTPEndpoint(CustomerRestController.class)
    @TestHTTPResource
    private URL customerRestControllerURL;

    private Customer customer;

    static Stream<CustomerCreateDTO> createCustomerSuccessData() {
        return Stream.of(
                new CustomerCreateDTO("Hui", "Boo", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("H", "B", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("12345678901234567890", "12345678901234567890", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("H", "B", Gender.OTHER, "hui@boo.de", "+49-40-58967572")
        );
    }

    static Stream<CustomerCreateDTO> createCustomerFailBecauseOfValidationFailureData() {
        return Stream.of(
                new CustomerCreateDTO(null, "Boo", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("Hui", null, Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("Hui", "Boo", null, "hui@boo.de", null),
                new CustomerCreateDTO("Hui", "Boo", Gender.OTHER, "invalidMail", null),
                new CustomerCreateDTO("123456789012345678901", "12345678901234567890", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("12345678901234567890", "123456789012345678901", Gender.OTHER, "hui@boo.de", null),
                new CustomerCreateDTO("12345678901234567890", "12345678901234567890", Gender.OTHER, "hui@boo.de", "wrongPhoneNumer")
        );
    }

    static Stream<CustomerUpdateDTO> updateCustomerSuccessData() {
        return Stream.of(
                new CustomerUpdateDTO(0L, "hui@boo.de", null),
                new CustomerUpdateDTO(0L, null, "+49-089-748829870"),
                new CustomerUpdateDTO(0L, "hui@boo.de", "+49-089-748829870")
        );
    }

    static Stream<CustomerUpdateDTO> updateCustomerFailBecauseOfValidationFailureData() {
        return Stream.of(
                new CustomerUpdateDTO(0L, "invalidMail", null),
                new CustomerUpdateDTO(0L, null, "invalidPhoneNumber"),
                new CustomerUpdateDTO(0L, null, null)
        );
    }

    @BeforeEach
    @Transactional
    void setUp() {
        this.customerRepository.deleteAll();

        customer = new Customer("Stefan", "Sarstedt", Gender.MALE,
                new Email("stefan.sarstedt@haw-hamburg.de"),
                new PhoneNumber("+49-040-428758434"));
        this.customerRepository.persist(customer);
    }

    // -------------------------------------------------------------------------------------------------------------------
    // für JSONPath siehe http://goessner.net/articles/JsonPath/ und den Tester unter https://jsonpath.curiousconcept.com/
    // -------------------------------------------------------------------------------------------------------------------
    @Test
    void getAllCustomersSuccess() {
        //@formatter:off
        given().
                // add this here to log request --> log().all().
        when().
                get(customerRestControllerURL).
        then().
                // add this here to log response --> log().all().
                statusCode(Response.Status.OK.getStatusCode()).
                body("lastName", hasItems("Sarstedt"));
        //@formatter:on
    }

    @Test
    void getCustomerSuccess() {
        //@formatter:off
        given().
        when().
                get(customerRestControllerURL + "/{id}", customer.getId()).
        then().
                statusCode(Response.Status.OK.getStatusCode()).
                body("lastName", equalTo("Sarstedt"));
        //@formatter:on
    }

    @Test
    void getCustomerFailBecauseOfNotFound() {
        //@formatter:off
        given().
        when().
                get(customerRestControllerURL + "/{id}", Integer.MAX_VALUE).
        then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }

    @ParameterizedTest
    @MethodSource("createCustomerSuccessData")
    void createCustomerSuccess(CustomerCreateDTO customerCreateDTO) {
        //@formatter:off
        given().
                contentType(ContentType.JSON).
                body(customerCreateDTO).
        when().
                post(customerRestControllerURL).
        then().
                statusCode(Response.Status.CREATED.getStatusCode()).
                body("id", is(greaterThan(0)));
        //@formatter:on
    }

    @ParameterizedTest
    @MethodSource("createCustomerFailBecauseOfValidationFailureData")
    void createCustomerFailBecauseOfValidationFailure(CustomerCreateDTO customerCreateDTO) {
        //@formatter:off
        given().
                contentType(ContentType.JSON).
                body(customerCreateDTO).
        when().
                post(customerRestControllerURL).
        then().
                statusCode(Response.Status.BAD_REQUEST.getStatusCode());
        //@formatter:on
    }

    @ParameterizedTest
    @MethodSource("updateCustomerSuccessData")
    void updateCustomerSuccess(CustomerUpdateDTO customerUpdateDTO) {
        customerUpdateDTO.setId(customer.getId());

        //@formatter:off
        given().
                contentType(ContentType.JSON).
                body(customerUpdateDTO).
        when().
                put(customerRestControllerURL).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @ParameterizedTest
    @MethodSource("updateCustomerFailBecauseOfValidationFailureData")
    void updateCustomerFailBecauseOfValidationFailure(CustomerUpdateDTO customerUpdateDTO) {
        customerUpdateDTO.setId(customer.getId());

        //@formatter:off
        given().
                contentType(ContentType.JSON).
                body(customerUpdateDTO).
        when().
                put(customerRestControllerURL).
        then().
                statusCode(Response.Status.BAD_REQUEST.getStatusCode());
        //@formatter:on
    }

    @Test
    void deleteCustomerSuccess() {
        //@formatter:off
        given().
                delete(customerRestControllerURL + "/{id}", customer.getId()).
        then().
                statusCode(Response.Status.OK.getStatusCode());
        //@formatter:on
    }

    @Test
    void deleteCustomerFailBecauseOfCustomerNotFound() {
        //@formatter:off
        given().
                delete(customerRestControllerURL + "/{id}", Integer.MAX_VALUE).
        then().
                statusCode(Response.Status.NOT_FOUND.getStatusCode());
        //@formatter:on
    }
}