package com.microservice.course.services;

import java.util.List;

import com.microservice.course.models.Course;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);
}