package com.crud.operation.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = StudentTypeValidator.class)
public @interface ValidateStudentType {
    public String message() default "Invalid! the student should be at-least an undergraduate and Postgraduate";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
