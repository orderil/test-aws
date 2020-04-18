package com.ilazarev.testaws.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidPersonModelValidator.class)
public @interface ValidPersonModel {
    String message() default "Required";

    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}
