package com.example.demo.services;

import com.example.demo.dtos.StudentDto;
import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StudentService implements IService {

    @Autowired
    StudentRepo repo;
    @Override
    public String getName() {
        return null;
    }
    @Override
    public List<Student> getAll() {
        return repo.findAll();
    }

    @Override
    public Student create(StudentDto studentDto) {
        Student student = Student.builder()
                .name(studentDto.getName())
                .thanhpho(studentDto.getThanhpho())
                .ngaysinh(studentDto.getNgaysinh())
                .xeploai(studentDto.getXeploai())
                .build();
                return repo.save(student);
    }

    @Override
    public Student update(StudentDto studentDto, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
