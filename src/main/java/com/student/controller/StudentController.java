package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Exception.RecordNotFoundException;
import com.student.model.StudentEntity;
import com.student.service.StudentService;

@RestController
@RequestMapping(value="/students", produces="application/json", consumes="application/json")
public class StudentController {
	
	@Autowired
    StudentService service;
 
    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        List<StudentEntity> list = service.getAllStudents();
 
        return new ResponseEntity<List<StudentEntity>>(list, HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
    	StudentEntity entity = service.getStudentById(id);
 
        return new ResponseEntity<StudentEntity>(entity, HttpStatus.OK);
    }
 
   @PostMapping
    public ResponseEntity<StudentEntity> createOrUpdateStudent(@Validated @RequestBody StudentEntity student)
                                                    throws RecordNotFoundException {
    	StudentEntity updated = service.createOrUpdateStudent(student);
        return new ResponseEntity<StudentEntity>(updated, HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteStudentById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        service.deleteStudentById(id);
        return HttpStatus.FORBIDDEN;
    }
    
}
