package com.haw.hurtigruten.bookingservice.util.constraints;

import com.haw.hurtigruten.bookingservice.domain.datatypes.Email;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailConstraint, String> {

    @Override
    public void initialize(EmailConstraint emailConstraint) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null)
            return true;
        else
            return Email.isValid(email);
    }
}