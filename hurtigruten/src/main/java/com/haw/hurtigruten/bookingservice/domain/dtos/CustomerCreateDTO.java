package com.haw.hurtigruten.bookingservice.domain.dtos;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Gender;
import com.haw.hurtigruten.bookingservice.util.constraints.EmailConstraint;
import com.haw.hurtigruten.bookingservice.util.constraints.PhoneNumberConstraint;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@RegisterForReflection
public class CustomerCreateDTO {

    @Size(min = 1, max = 20)
    @NotNull
    private String firstName;

    @Size(min = 1, max = 20)
    @NotNull
    private String lastName;

    @NotNull
    private Gender gender;

    @NotNull
    @EmailConstraint
    private String email;

    @PhoneNumberConstraint
    private String phoneNumber;
}
