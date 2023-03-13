package com.managent.School.repository.Adapter.TeacherAdapter;

import com.managent.School.core.port.out.teacherOut.GetAllTeacherPort;
import com.managent.School.entity.Teacher;
import com.managent.School.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class GetAllTeacherAdapter implements GetAllTeacherPort {
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
}
