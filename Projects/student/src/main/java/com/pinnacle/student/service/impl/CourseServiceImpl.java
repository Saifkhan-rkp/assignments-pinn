package com.pinnacle.student.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinnacle.student.dto.CourseDTO;
import com.pinnacle.student.exception.CourseNotFoundException;
import com.pinnacle.student.model.Course;
import com.pinnacle.student.repository.CourseRepository;
import com.pinnacle.student.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository cRep;

    @Override
    public Course saveCourse(Course course) {
        return cRep.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return cRep.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        Optional<Course> opt = cRep.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new CourseNotFoundException("Course with Id : " + id + " Not Found");
        }
    }

    @Override
    public void deleteCourseById(Long id) {
        cRep.delete(getCourseById(id));
    }

    @Override
    public void updateCourse(Course course) {
        cRep.save(course);
    }

    public List<CourseDTO> getCourseList(){
        return cRep.getCourseList();
    }
}
