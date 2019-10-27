package com.kazinvest.demo.project.controller;

import com.kazinvest.demo.project.model.StudentEntity;
import com.kazinvest.demo.project.service.IStudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService service;

    @RequestMapping(value = "/read/iterable", method = RequestMethod.GET)
    List<StudentEntity> findAll(){
        return service.getAll();
    }

    @RequestMapping(value = "/read/by/managerId/{id}", method = RequestMethod.GET)
    List<StudentEntity> findAllByManagerId(@PathVariable("id") Integer id){
        return service.getAllByManagerId(id);
    }

    @RequestMapping(value = "/read/by/id/{id}", method = RequestMethod.GET)
    StudentEntity getById(@PathVariable("id") Integer id){
        return service.getById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    StudentEntity save(@RequestBody  StudentEntity studentEntity){
        return service.saveStudent(studentEntity);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    StudentEntity update(@RequestBody  StudentEntity studentEntity) throws NotFoundException {
        return service.updateStudent(studentEntity);
    }


    @RequestMapping(value = "/delete/by/id/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Integer id) throws NotFoundException {
        service.deleteById(id);
        return "Success";
    }
}
