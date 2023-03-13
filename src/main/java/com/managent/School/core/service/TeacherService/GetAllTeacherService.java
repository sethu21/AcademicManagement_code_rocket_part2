package com.managent.School.core.service.TeacherService;

import com.managent.School.core.port.in.teacher.GetAllTeacherUseCase;
import com.managent.School.core.port.out.teacherOut.GetAllTeacherPort;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllTeacherService implements GetAllTeacherUseCase {
    private GetAllTeacherPort getAllTeacherPort;
    @Override
    public List<Teacher> getAllTeacher() {
        return getAllTeacherPort.getAllTeacher();
    }
}
