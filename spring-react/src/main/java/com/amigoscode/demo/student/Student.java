package com.amigoscode.demo.student;

import java.util.UUID;

public class Student {
    private final UUID studentId;
    private final String firsName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(UUID studentId, String firsName, String lastName, String email, Gender gender) {
        this.studentId = studentId;
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender {
        MALE, FEMALE
    }
}
