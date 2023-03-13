package com.managent.School.controller;

import com.managent.School.core.port.in.teacher.*;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@AllArgsConstructor
public class TeacherController {
    private SaveTeacherUseCase saveTeacherUseCase;
    private UpdateTeacherUseCase updateTeacherUseCase;

    private GetAllTeacherUseCase getAllTeacherUseCase;
    private GetTeacherById getTeacherById;
    private DeleteTeacherUseCase deleteTeacherUseCase;

    @GetMapping()
    public List<Teacher> getAllTeacher(){
        return getAllTeacherUseCase.getAllTeacher();
    }


    @PostMapping
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
        return new ResponseEntity<Teacher>(saveTeacherUseCase.saveTeacher(teacher), HttpStatus.CREATED);

    }
    @PutMapping("{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable("id") long id,@RequestBody Teacher teacher){
        return new ResponseEntity<Teacher>(updateTeacherUseCase.updateTeacher(teacher,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable("id") long id){
        deleteTeacherUseCase.deleteTeacher(id);
        return new ResponseEntity<String>("Teacher entity Deleted Successfully",HttpStatus.OK);

    }
    @GetMapping("{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable("id") long id){
        return new ResponseEntity<Teacher>(getTeacherById.getTeacherById(id),HttpStatus.OK);

    }


}
