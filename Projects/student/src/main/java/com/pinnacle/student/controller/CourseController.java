package com.pinnacle.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pinnacle.student.model.Course;
import com.pinnacle.student.service.CourseService;

@Controller
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("")
    public String coursePage() {
        return "indexCourse";
    }

    @GetMapping("/all")
    public String getAllCourses(@RequestParam(value = "message", required = false) String msg, Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("list", courses);
        model.addAttribute("message", msg);
        return "allCoursesPage";
    }

}
