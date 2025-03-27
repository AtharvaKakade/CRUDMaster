package com.crud.operation.Validation;

import ch.qos.logback.core.util.StringUtil;
import com.mysql.cj.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class CGPAValidator implements ConstraintValidator<ValidateCGPA, Float> {

    private Float min;
    private Float max;

    @Override
    public void initialize(ValidateCGPA constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Float studentCGPA, ConstraintValidatorContext constraintValidatorContext) {
//        if (studentCGPA == null) {
//
//            return false; // Null values are invalid
//        }

        BigDecimal cgpaValue = BigDecimal.valueOf(studentCGPA);
        BigDecimal minValue = BigDecimal.valueOf(min);
        BigDecimal maxValue = BigDecimal.valueOf(max);


        return cgpaValue.compareTo(minValue) >= 0 && cgpaValue.compareTo(maxValue) <= 0;
    }
}
