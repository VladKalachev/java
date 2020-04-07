package com.amigoscode.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET
    @GetMapping
    public List<Student> getAllStudensts() {
        return studentService.getAllStudents();
    }

    // POST
    @PostMapping
    public void addNewStudent(@RequestBody Student student) {
       studentService.addNewStudent(null, student);
        //System.out.println(student);
    }

}
