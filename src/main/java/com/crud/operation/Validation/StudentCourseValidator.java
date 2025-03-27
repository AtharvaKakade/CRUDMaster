package com.crud.operation.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class StudentCourseValidator implements ConstraintValidator <ValidateStudentCourse,String>{
    @Override
    public boolean isValid(String StudentCourse, ConstraintValidatorContext constraintValidatorContext) {
        List<String> studentCourses = Arrays.asList("MCA", "MBA", "BSc", "BE", "BTech", "BCA", "MTech", "MSC");
        return studentCourses.contains(StudentCourse);
    }
}
