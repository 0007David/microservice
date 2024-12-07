package com.microservice.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.course.models.Course;
import com.microservice.course.repositories.ICourseRepository;

public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository repository;

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

}
