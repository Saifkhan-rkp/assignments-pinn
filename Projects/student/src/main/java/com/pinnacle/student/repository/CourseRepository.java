	package com.pinnacle.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pinnacle.student.dto.CourseDTO;
import com.pinnacle.student.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT new com.pinnacle.student.dto.CourseDTO(c.id, c.name, c.fees) FROM Course c")
    List<CourseDTO> getCourseList();
}
