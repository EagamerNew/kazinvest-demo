package com.kazinvest.demo.project.repository;

import com.kazinvest.demo.project.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
    StudentEntity getById(Integer id);
    List<StudentEntity> getAllByManagerId(Integer managerId);
    StudentEntity save(StudentEntity studentEntity);

    void deleteById(Integer id);
}
