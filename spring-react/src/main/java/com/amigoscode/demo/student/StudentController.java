package com.amigoscode.demo.student;

import com.amigoscode.demo.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

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

    // GET/id
    @GetMapping(path = "{studentId}/courses")
    public List<StudentCourse> getAllCoursesForStudent(@PathVariable("studentId") UUID studentId) {
        return studentService.getAllCoursesForStudent(studentId);
    }

    // POST
    @PostMapping
    public void addNewStudent(@RequestBody @Valid Student student) {
       studentService.addNewStudent(student);
    }

}
