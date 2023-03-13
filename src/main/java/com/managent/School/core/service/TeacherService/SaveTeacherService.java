package com.managent.School.core.service.TeacherService;

import com.managent.School.core.port.in.teacher.SaveTeacherUseCase;
import com.managent.School.core.port.out.teacherOut.SaveTeacherPort;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveTeacherService implements SaveTeacherUseCase {
    private final SaveTeacherPort saveTeacherPort;
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return saveTeacherPort.saveTeacher(teacher);
    }
}
