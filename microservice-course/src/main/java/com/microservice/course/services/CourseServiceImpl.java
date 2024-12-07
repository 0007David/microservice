package com.microservice.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.course.Controllers.dtos.StudentDto;
import com.microservice.course.client.StudentClient;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.models.Course;
// import com.microservice.course.repositories.ICourseRepository;
import com.microservice.course.repositories.ICourseRepository2;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository2 repository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) repository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        repository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {
        // Consultar course
        Course course = repository.findById(idCourse).orElse(new Course());

        // Obtener los students
        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
            .courseName(course.getName())
            .teacher(course.getTeacher())
            .studentDtoList(studentDtoList)
            .build();
    }

}
