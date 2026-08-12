package com.bridgelabz.project.controller;

import com.bridgelabz.project.dto.StudentDTO;
import com.bridgelabz.project.entity.Student;
import com.bridgelabz.project.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // GET student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

//    // POST student
//    @PostMapping
//    public Student addStudent(@Valid @RequestBody Student student) {
//        return studentService.addStudent(student);
//    }

    // PUT student
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Integer id,
            @Valid @RequestBody Student student) {

        return studentService.updateStudent(id, student);
    }

    // DELETE student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {

        studentService.deleteStudent(id);

        return "Student deleted successfully";
    }


    @PostMapping
    public Student addStudent(@Valid @RequestBody StudentDTO dto){
        return studentService.addStudent(dto);
    }
}
