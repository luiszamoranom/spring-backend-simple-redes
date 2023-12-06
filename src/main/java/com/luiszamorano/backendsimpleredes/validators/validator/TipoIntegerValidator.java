package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoInteger;

public class TipoIntegerValidator implements ConstraintValidator<TipoInteger, Object> {

    @Override
    public void initialize(TipoInteger constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }

        if (value instanceof Integer) {
            return true;
        }

        // Verificar si el valor es una representación de texto de un número entero válido
        try {
            Integer.parseInt(value.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

