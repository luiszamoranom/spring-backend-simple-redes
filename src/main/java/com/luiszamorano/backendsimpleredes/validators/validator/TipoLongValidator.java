package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoLong;

public class TipoLongValidator implements ConstraintValidator<TipoLong, Object> {

    @Override
    public void initialize(TipoLong constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }

        if (value instanceof Long) {
            return true;
        }

        // Verificar si el valor es una representación de texto de un número largo válido
        try {
            Long.parseLong(value.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
