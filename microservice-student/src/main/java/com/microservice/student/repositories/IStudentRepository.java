package com.microservice.student.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservice.student.models.Student;

public interface IStudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.courseId =:courseId")
    List<Student> findAllStudents(Long idCourse);

    //List<Student> findAllByCourseId(Long courseId);

}
