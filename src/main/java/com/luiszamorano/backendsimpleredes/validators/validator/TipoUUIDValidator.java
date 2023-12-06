package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoUUID;

import java.util.UUID;

public class TipoUUIDValidator implements ConstraintValidator<TipoUUID, Object> {

    @Override
    public void initialize(TipoUUID constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }

        if (value instanceof UUID) {
            return true;
        }

        try {
            UUID.fromString(value.toString());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

