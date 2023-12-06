package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoCharValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoCharValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChar {
    String message() default "El campo debe ser un carácter";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
