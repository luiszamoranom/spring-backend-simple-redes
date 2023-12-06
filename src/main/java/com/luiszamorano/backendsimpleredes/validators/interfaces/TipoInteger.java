package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoIntegerValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoIntegerValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoInteger {
    String message() default "El campo debe ser un número entero";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
