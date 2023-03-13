package com.managent.School.core.service.TeacherService;

import com.managent.School.core.port.in.teacher.UpdateTeacherUseCase;
import com.managent.School.core.port.out.teacherOut.UpdateTeacherPort;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateTeacherService implements UpdateTeacherUseCase {
    private UpdateTeacherPort updateTeacherPort;
    @Override
    public Teacher updateTeacher(Teacher teacher, Long id) {
        return updateTeacherPort.updateTeacher(teacher,id);
    }
}
