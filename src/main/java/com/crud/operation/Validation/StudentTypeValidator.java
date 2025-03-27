package com.crud.operation.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.List;

public class StudentTypeValidator implements ConstraintValidator<ValidateStudentType,String> {
    @Override
    public boolean isValid(String StudentType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> studentTypes =  Arrays.asList("UnderGraduate", "PostGraduate");
        return studentTypes.contains(StudentType);
    }
}
