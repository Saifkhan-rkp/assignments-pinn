package com.pinnacle.student.service;

import java.util.List;
import java.util.Map;

import com.pinnacle.student.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents(Long courseId, Integer feesBalance);
    public Student getStudentById(Long id);
    public void deleteStudentById(Long id);
    public void updateStudent(Student student);
    public Map<String, Double> getTotalStats();
}