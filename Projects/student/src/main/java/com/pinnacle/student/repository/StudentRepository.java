package com.pinnacle.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pinnacle.student.dto.StudentDTO;
import com.pinnacle.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT new com.pinnacle.student.dto.StudentDTO(s.id, s.fees, s.feesPaid, s.feesBalance) FROM Student s")
    public List<StudentDTO> getAllFeesDetail();

    @Query("SELECT s FROM Student s WHERE s.course.id = :courseId")
    List<Student> findByCourseId(@Param("courseId") Long courseId);

    @Query("SELECT s FROM Student s WHERE s.feesBalance > 0")
    List<Student> findByBalanceFeesUnpaid();
    
    @Query("SELECT s FROM Student s WHERE s.feesPaid = s.fees")
    List<Student> findByFeesPaid();
    
    @Query("SELECT s FROM Student s WHERE s.course.id = :courseId AND s.feesBalance > 0")
    List<Student> findByCourseIdAndBalanceFeesUnpaid(@Param("courseId") Long courseId);
    
    @Query("SELECT s FROM Student s WHERE s.course.id = :courseId AND s.feesPaid = s.fees")
    List<Student> findByCourseIdAndFeesPaid(@Param("courseId") Long courseId);
    // @Query("SELECT s FROM Student s WHERE s.course.id = :")
    // List<Student> findByCourseId(Long courseId);
        
}
