package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoStringValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoStringValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoString {
    String message() default "El campo debe ser una cadena de texto";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}