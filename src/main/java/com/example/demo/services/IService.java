package com.example.demo.services;

import com.example.demo.dtos.StudentDto;
import com.example.demo.models.Student;

import java.util.List;

public interface IService {

    String getName();

    List<Student> getAll();

    Student create(StudentDto studentDto);

    Student update(StudentDto studentDto, Long id);

    void delete(Long id);
}
