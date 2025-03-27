package com.crud.operation.Entity;
import com.crud.operation.Validation.ValidateCGPA;
import com.crud.operation.Validation.ValidateStudentCourse;
import com.crud.operation.Validation.ValidateStudentType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
//import lombok.Data;
//import lombok.NonNull;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @NotNull
    private Long id;
//    private String phone;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Email(message = "Incorrect email format")
    private String email;
    @Min(value = 18, message = "Age is just a number, enter bigger one" )
    private int age;

    // Custom Validators
    @ValidateStudentType
    private String studentType;

    @ValidateStudentCourse
    private String studentCourse;

    @JsonProperty("cgpa")
    @ValidateCGPA(min = 1.0f, max = 10.0f,
            message = "CGPA must be between 1.00 and 10.00")
    private Float CGPA;

    public Float getCGPA() {
        return CGPA;
    }

    public void setCGPA(Float CGPA) {
        this.CGPA = CGPA;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Student() {
    }


    public Student(String name, String email, int age,String studentType,String studentCourse, Float CGPA) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.studentType = studentType;
        this.studentCourse = studentCourse;
        this.CGPA = CGPA;



    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
}