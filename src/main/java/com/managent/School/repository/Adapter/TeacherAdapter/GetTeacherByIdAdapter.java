package com.managent.School.repository.Adapter.TeacherAdapter;

import com.managent.School.core.port.out.teacherOut.GetTeacherByIdPort;
import com.managent.School.entity.Teacher;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class GetTeacherByIdAdapter implements GetTeacherByIdPort {
    private TeacherRepository teacherRepository;
    @Override
    public Teacher getTeacherById(long id) {
        Optional<Teacher> teacher =teacherRepository.findById(id);
        if(teacher.isPresent()){
            return teacher.get();
        }else {
            throw new ResourceNotFoundException("Teacher","Id",id);
        }
    }
}
