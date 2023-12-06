package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoLongValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoLongValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoLong {
    String message() default "El campo debe ser un número largo";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}