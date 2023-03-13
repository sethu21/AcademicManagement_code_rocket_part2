package com.managent.School.controller;

import com.managent.School.core.port.in.Students.*;
import com.managent.School.entity.Student;
import com.managent.School.entity.Subject;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
   private SaveStudentUseCase saveStudentUseCase;
   private GetAllStudentUseCase getAllStudentUseCase;
   private GetStudentByIdUseCase getStudentByIdUseCase;
   private UpdateStudentUseCase updateStudentUseCase;
   private DeleteStudentUseCase deleteStudentUseCase;
   private AddSubjectToStudentUseCase addSubjectToStudentUseCase;
   private DeleteSubjectForStudentUseCase deleteSubjectForStudentUseCase;
   private GetAllSubjectForStudentUseCase getAllSubjectForStudentUseCase;


    //CREATE EMPLOYEE REST API
    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(saveStudentUseCase.saveStudent(student), HttpStatus.CREATED);

    }

    //BUILD ALL student REST API
    @GetMapping
    public List<Student> getAllStudents(){
        return getAllStudentUseCase.getAllStudents();

    }

    //build get student REST api
    //http://localhost:8080/api/management/1
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId){
        return  new ResponseEntity<Student>(getStudentByIdUseCase.getStudentById(studentId),HttpStatus.OK);
    }

    // update student REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id ,
                                                  @RequestBody Student student){

        return new ResponseEntity<Student>(updateStudentUseCase.updateStudent(student,id),HttpStatus.OK);
    }

    // Delete student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        deleteStudentUseCase.deleteStudent(id);

        return new ResponseEntity<String>("Student deleted successfully.",HttpStatus.OK);

    }
    //ADD SUBJECT TO STUDENT REST API
    @PostMapping("/{studentId}/subjects/{subjectId}")
    public ResponseEntity<Student> addSubject(@PathVariable long studentId,
                                              @PathVariable long subjectId){
        Student updatedStudent = addSubjectToStudentUseCase.addSubject(studentId, subjectId);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    //DELETE SUBJECT FROM STUDENT REST API
    @DeleteMapping("/{studentId}/subjects/{subjectId}")
    public ResponseEntity<Student> deleteSubject(@PathVariable long studentId,
                                                 @PathVariable long subjectId){
        Student updatedStudent = deleteSubjectForStudentUseCase.deleteSubject(studentId, subjectId);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    //RETRIEVE ALL SUBJECTS FOR STUDENT REST API
    @GetMapping("/{studentId}/subjects")
    public ResponseEntity<List<Subject>> getAllSubjectsForStudent(@PathVariable long studentId){
        List<Subject> subject = getAllSubjectForStudentUseCase.getAllSubjectsForStudent(studentId);
        return new ResponseEntity<>(subject, HttpStatus.OK);
    }


}
