package com.luiszamorano.backendsimpleredes.validators.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;
import com.luiszamorano.backendsimpleredes.validators.validator.TipoBooleanValidator;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TipoBooleanValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoBoolean {
    String message() default "El campo debe ser booleano";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
