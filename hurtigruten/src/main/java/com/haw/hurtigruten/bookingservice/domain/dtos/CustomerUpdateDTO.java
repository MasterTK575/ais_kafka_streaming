package com.haw.hurtigruten.bookingservice.domain.dtos;

import com.haw.hurtigruten.bookingservice.util.constraints.EmailConstraint;
import com.haw.hurtigruten.bookingservice.util.constraints.PhoneNumberConstraint;
import com.haw.hurtigruten.bookingservice.util.constraints.ProvideAtLeastOneFieldConstraint;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@RegisterForReflection
@ProvideAtLeastOneFieldConstraint(
        message = "Provide at least one of the fields email and phoneNumber.",
        fields = {"email", "phoneNumber"}
)
public class CustomerUpdateDTO {

    @NotNull
    private Long id;

    @EmailConstraint
    private String email;

    @PhoneNumberConstraint
    private String phoneNumber;
}
