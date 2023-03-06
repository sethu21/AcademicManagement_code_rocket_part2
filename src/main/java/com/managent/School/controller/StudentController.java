package com.managent.School.controller;

import com.managent.School.entity.Student;
import com.managent.School.service.StudentService;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/management")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    //CREATE EMPLOYEE REST API
    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);

    }

    //BUILD ALL student REST API
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }

    //build get student REST api
    //http://localhost:8080/api/management/1
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId){
        return  new ResponseEntity<Student>(studentService.getStudentById(studentId),HttpStatus.OK);
    }

    // update student REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id ,
                                                  @RequestBody Student student){

        return new ResponseEntity<Student>(studentService.UpdateStudent(student,id),HttpStatus.OK);
    }

    // Delete student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        studentService.deleteStudent(id);

        return new ResponseEntity<String>("Student deleted successfully.",HttpStatus.OK);

    }
}
