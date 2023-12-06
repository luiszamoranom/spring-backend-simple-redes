package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoUUIDValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoUUIDValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoUUID {
    String message() default "El campo debe ser UUID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}