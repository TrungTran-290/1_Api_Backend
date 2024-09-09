package com.example.demo.controllers;

import com.example.demo.dtos.StudentDto;
import com.example.demo.models.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("")
    public String getStudent() {
        return "Hello";
    }
    @GetMapping("/GetAll")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }
    @PostMapping("/Create")
    public ResponseEntity<?> createStudent(@RequestBody StudentDto studentDto, BindingResult result) {
        if (result.hasErrors()) {
            List<String> errors = result.getAllErrors().stream().map(error -> error.getDefaultMessage()).toList();
            return ResponseEntity.badRequest().body(errors);
        }
         studentService.create(studentDto);
        return ResponseEntity.ok("insert" +studentDto);
    }
    @PostMapping("/Create2")
    public Student createStudent(@RequestBody StudentDto studentDto) {
        return studentService.create(studentDto);
    }
}
