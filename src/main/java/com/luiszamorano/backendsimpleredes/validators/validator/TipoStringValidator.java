package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoString;

public class TipoStringValidator implements ConstraintValidator<TipoString, Object> {

    @Override
    public void initialize(TipoString constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }
        
        return value instanceof String;
    }
}
