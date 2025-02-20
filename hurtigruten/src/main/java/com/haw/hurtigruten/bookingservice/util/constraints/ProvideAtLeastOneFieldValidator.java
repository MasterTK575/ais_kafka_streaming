package com.haw.hurtigruten.bookingservice.util.constraints;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.Field;

public class ProvideAtLeastOneFieldValidator implements ConstraintValidator<ProvideAtLeastOneFieldConstraint, Object> {

    private String[] fields;

    public void initialize(ProvideAtLeastOneFieldConstraint constraintAnnotation) {
        this.fields = constraintAnnotation.fields();
    }

    public boolean isValid(Object object, ConstraintValidatorContext context) {
        for (String fieldName : fields) {
            Field field = null;
            try {
                field = object.getClass().getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException("NoSuchFieldException while checking field " + fieldName, e);
            }
            field.setAccessible(true);
            try {
                Object value = field.get(object);
                if (value != null) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException while checking field " + fieldName, e);
            }
        }
        return false;
    }
}