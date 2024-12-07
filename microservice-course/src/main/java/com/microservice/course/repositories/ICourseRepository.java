package com.microservice.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservice.course.models.Course;

public interface ICourseRepository extends CrudRepository<Course, Long> {
    
}
