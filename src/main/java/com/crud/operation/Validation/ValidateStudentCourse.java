package com.crud.operation.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = StudentCourseValidator.class)
public @interface ValidateStudentCourse {
    public String message() default "No such courses available please enter the valid one";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
