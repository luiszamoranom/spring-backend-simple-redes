package com.luiszamorano.backendsimpleredes.validators.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoBoolean;

public class TipoBooleanValidator implements ConstraintValidator<TipoBoolean, Object> {

    @Override
    public void initialize(TipoBoolean constraintAnnotation) {}

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // se maneja con @NotNull
        }

        if (value instanceof Boolean) {
            return true;
        }

        // intentar una conversión por si se escribió no en minuscula totalmente
        String strValue = value.toString().toLowerCase();
        return strValue.equals("true") || strValue.equals("false");
    }
}
