package com.haw.hurtigruten.bookingservice.domain.dtos;

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
public class BookingCreateDTO {

    @Size(min = 1, max = 20)
    @NotNull
    public String ferry;
}
