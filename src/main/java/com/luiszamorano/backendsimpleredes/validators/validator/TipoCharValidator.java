package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoChar;

public class TipoCharValidator implements ConstraintValidator<TipoChar, Object> {

    @Override
    public void initialize(TipoChar constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }

        if (value instanceof Character) {
            return true;
        }

        // Verificar si el valor es una cadena de longitud 1 que representa un carácter
        String strValue = value.toString();
        return strValue.length() == 1;
    }
}
