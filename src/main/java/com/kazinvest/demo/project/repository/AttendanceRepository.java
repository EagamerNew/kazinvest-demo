package com.kazinvest.demo.project.repository;

import com.kazinvest.demo.project.model.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Integer> {
    AttendanceEntity getById(Integer id);
    List<AttendanceEntity> getAllByStudentId(Integer studentId);
}
