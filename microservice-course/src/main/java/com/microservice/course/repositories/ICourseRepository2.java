package com.microservice.course.repositories;

import org.springframework.data.repository.CrudRepository;

import com.microservice.course.models.Course;

public interface ICourseRepository2 extends CrudRepository<Course, Long> {

}
