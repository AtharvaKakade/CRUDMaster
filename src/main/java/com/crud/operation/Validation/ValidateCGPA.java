package com.crud.operation.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CGPAValidator.class)
public @interface ValidateCGPA {
    String message() default "Please enter CGPA between 1.00 and 10.00";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    float min() default 1.0f;
    float max() default 10.0f; //  Fixed max value
}
