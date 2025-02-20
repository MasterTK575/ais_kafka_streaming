package com.haw.hurtigruten.bookingservice.util.constraints;

import com.haw.hurtigruten.bookingservice.domain.datatypes.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraint, String> {

    @Override
    public void initialize(PhoneNumberConstraint phoneNumberConstraint) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneNumber == null)
            return true;
        else
            return PhoneNumber.isValid(phoneNumber);
    }
}