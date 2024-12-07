package com.microservice.student.services;

import java.util.List;

import com.microservice.student.models.Student;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save (Student student);

    List<Student> findByIdCourse(Long idCourse);

}
