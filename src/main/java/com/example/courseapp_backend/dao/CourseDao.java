package com.example.courseapp_backend.dao;


import com.example.courseapp_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT `id`, `coursetitle`, `date`, `description`, `duration`, `venue` FROM `course` WHERE `coursetitle` = :coursetitle", nativeQuery = true)
    List <Course> SearchCourse(@Param("coursetitle") String coursetitle);
}
