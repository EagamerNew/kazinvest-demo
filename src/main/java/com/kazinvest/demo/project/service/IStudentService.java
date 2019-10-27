package com.kazinvest.demo.project.service;

import com.kazinvest.demo.project.model.StudentEntity;
import javassist.NotFoundException;

import java.util.List;

public interface IStudentService {
    StudentEntity getById(Integer id);
    List<StudentEntity> getAll();
    List<StudentEntity> getAllByManagerId(Integer managerId);
    StudentEntity saveStudent(StudentEntity studentEntity);
    StudentEntity updateStudent(StudentEntity studentEntity) throws NotFoundException;
    void deleteById(Integer id) throws NotFoundException;
}
