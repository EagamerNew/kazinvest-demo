package com.kazinvest.demo.project.service.impl;

import com.kazinvest.demo.project.model.StudentEntity;
import com.kazinvest.demo.project.repository.StudentRepository;
import com.kazinvest.demo.project.service.IStudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public StudentEntity getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<StudentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public List<StudentEntity> getAllByManagerId(Integer managerId) {
        return repository.getAllByManagerId(managerId);
    }

    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return repository.save(studentEntity);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) throws NotFoundException {
        StudentEntity old = repository.getById(studentEntity.getId());
        if(old == null){
            throw new NotFoundException("Student not found with id: " + studentEntity.getId());
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) throws NotFoundException {
        StudentEntity old = repository.getById(id);
        if(old == null){
            throw new NotFoundException("Student not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
