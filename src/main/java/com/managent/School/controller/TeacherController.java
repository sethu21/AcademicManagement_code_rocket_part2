package com.managent.School.controller;

import com.managent.School.core.port.in.SaveTeacherUseCase;
import com.managent.School.core.port.in.UpdateTeacherUseCase;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teachers")
@AllArgsConstructor
public class TeacherController {
    private SaveTeacherUseCase saveTeacherUseCase;
    private UpdateTeacherUseCase updateTeacherUseCase;

    @PostMapping
    public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
        return new ResponseEntity<Teacher>(saveTeacherUseCase.saveTeacher(teacher), HttpStatus.CREATED);

    }
    @PutMapping("{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable("id") long id,@RequestBody Teacher teacher){
        return new ResponseEntity<Teacher>(updateTeacherUseCase.updateTeacher(teacher,id),HttpStatus.OK);
}

}
