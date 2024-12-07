package com.microservice.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.student.models.Student;
import com.microservice.student.repositories.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository repository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return repository.findAllStudents(idCourse);
    }

}
