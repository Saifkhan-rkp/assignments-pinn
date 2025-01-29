package com.pinnacle.student.service;

import java.util.List;

import com.pinnacle.student.dto.CourseDTO;
import com.pinnacle.student.model.Course;

public interface CourseService {
    public Course saveCourse(Course Course);
    public List<Course> getAllCourses();
    public List<CourseDTO> getCourseList();
    public Course getCourseById(Long id);
    public void deleteCourseById(Long id);
    public void updateCourse(Course Course);
}
