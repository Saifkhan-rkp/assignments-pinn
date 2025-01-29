package com.pinnacle.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PathVariable;

import com.pinnacle.student.dto.CourseDTO;
import com.pinnacle.student.model.Course;
import com.pinnacle.student.model.Student;
import com.pinnacle.student.service.CourseService;
import com.pinnacle.student.service.StudentService;
import com.pinnacle.student.exception.StudentNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String StudentHome(Model model) {

        model.addAttribute("stats", studentService.getTotalStats());

        return "indexStudents";
    }

    @GetMapping("/all")
    public String allStudents(@RequestParam(value = "message", required = false) String message,
            @RequestParam(value = "course", required = false) Long courseId,
            @RequestParam(value = "feesBalance", required = false) Integer feesBalance,
            Model model) {
        List<Student> students = studentService.getAllStudents(courseId, feesBalance);
        List<CourseDTO> courses = courseService.getCourseList();
        model.addAttribute("courselist", courses);
        model.addAttribute("studentlist", students);
        model.addAttribute("message", message);
        return "AllStudentsPage";
    }

    @GetMapping("/add")
    public String addStudent(@RequestParam(value = "message", required = false) String msg, Model model) {
        List<CourseDTO> courses = courseService.getCourseList();
        model.addAttribute("courselist", courses);
        model.addAttribute("message", msg);
        return "addStudentPage";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@RequestParam(value = "message", required = false) String msg,
            Model model,
            @PathVariable("id") Long id,
            RedirectAttributes attributes) {
        // List<CourseDTO> courses = courseService.getCourseList();
        // model.addAttribute("courselist", courses);
        String page = null;
        try {
            Student student = studentService.getStudentById(id);
            model.addAttribute("student", student);
            model.addAttribute("message", msg);
            page = "editStudentPage";
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
            attributes.addAttribute("message", e.getMessage());
            page = "redirect:/student/all";
        }
        return page;
    }

    @PostMapping("/save")
    public String saveNewStudent(@ModelAttribute Student student, RedirectAttributes attributes) {
        try {
            student.setFeesBalance(student.getFees() - student.getFeesPaid());
            // Updating Course
            Course course = courseService.getCourseById(student.getCourse().getId());
            course.setTotalEnrolled(course.getTotalEnrolled() + 1);
            courseService.updateCourse(course);

            Student s = studentService.saveStudent(student);
            Long id = s.getId();
            String message = "Record with id : '" + id + "' is saved successfully !";
            attributes.addAttribute("message", message);
            return "redirect:add";
        } catch (Exception e) {
            attributes.addAttribute("message", "Unable to save the record. Please try again !");
            return "redirect:all";
        }
    }

    @PostMapping("/update")
    public String postMethodName(@ModelAttribute Student student,
            RedirectAttributes attributes) {
        try {
            System.out.println("Course Id" + student.getCourse().getId());
            Course course = courseService.getCourseById(student.getCourse().getId());
            student.setCourse(course);
            student.setFeesBalance(student.getFees() - student.getFeesPaid());
            studentService.updateStudent(student);
            Long id = student.getId();
            attributes.addAttribute("message", "Student Record with id : '" + id + "' is updated successfully !");
            return "redirect:edit/" + id;
        } catch (Exception e) {
            attributes.addAttribute("message", "Unable to save the record. Please try again !");
            return "redirect:all";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id, RedirectAttributes attributes) {
        studentService.deleteStudentById(id);
        attributes.addAttribute("message", "Student Record with id : '" + id + "' is deleted successfully");
        return "redirect:/student/all";
    }

}
