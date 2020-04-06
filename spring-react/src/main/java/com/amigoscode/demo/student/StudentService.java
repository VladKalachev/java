package com.amigoscode.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Бизнес логика
 */
@Service
public class StudentService {

    public final StudentDataAccessService studentDataAccessService;

    @Autowired
    public StudentService(StudentDataAccessService studentDataAccessService) {
        this.studentDataAccessService = studentDataAccessService;
    }


    public List<Student> getAllStudents () {
        return studentDataAccessService.selectAllStudents();
    }
}
