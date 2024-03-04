package com.janvierscode.student;


import java.time.LocalDate;

public class Student {
    private String fistName;
    private String lastName;
    private String email;
    private Integer age;
    private LocalDate dateOfBirth;


    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String fistName, String lastName, String email, Integer age, LocalDate dateOfBirth) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }
}
