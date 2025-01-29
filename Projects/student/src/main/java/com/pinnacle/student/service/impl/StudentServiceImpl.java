package com.pinnacle.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinnacle.student.dto.StudentDTO;
import com.pinnacle.student.exception.StudentNotFoundException;
import com.pinnacle.student.model.Student;
import com.pinnacle.student.repository.StudentRepository;
import com.pinnacle.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository sRep;

    @Override
    public Student saveStudent(Student student) {
        return sRep.save(student);
    }

    @Override
    public List<Student> getAllStudents(Long courseId, Integer feesBalance) {
        System.out.println(courseId+" "+feesBalance);
        if (courseId != null && feesBalance != null) {
            System.out.println("Im here");
            return feesBalance == 0 ? sRep.findByCourseIdAndFeesPaid(courseId)
            : sRep.findByCourseIdAndBalanceFeesUnpaid(courseId);

        } else if (courseId != null) {
            System.out.println("Im here 1");
            return sRep.findByCourseId(courseId);
        } else if (feesBalance != null) {
            System.out.println("Im here 2");
            return feesBalance == 0 ? sRep.findByFeesPaid() : sRep.findByBalanceFeesUnpaid();
        } else {
            System.out.println("Im here 3");
            return sRep.findAll();
        }
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> opt = sRep.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new StudentNotFoundException("StudentNotFoundException: Student with Id : " + id + " Not Found");
        }
    }

    @Override
    public void deleteStudentById(Long id) {
        sRep.delete(getStudentById(id));
    }

    @Override
    public void updateStudent(Student student) {
        sRep.save(student);
    }

    @Override
    public Map<String, Double> getTotalStats() {
        Map<String, Double> stats = new HashMap<>();
        List<StudentDTO> dto = sRep.getAllFeesDetail();
        double count = dto.stream().count();
        double totalFees = dto.stream().mapToDouble(StudentDTO::getFees).sum();
        double totalBalanceFees = dto.stream().mapToDouble(StudentDTO::getFeesBalance).sum();
        double totalPaidFees = dto.stream().mapToDouble(StudentDTO::getFeesPaid).sum();

        stats.put("count", count);
        stats.put("totalFees", totalFees);
        stats.put("totalBalanceFees", totalBalanceFees);
        stats.put("totalPaidFees", totalPaidFees);

        return stats;
    }

}
