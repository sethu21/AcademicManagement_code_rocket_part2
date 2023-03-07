package com.managent.School.core.port;

import com.managent.School.core.port.in.UpdateTeacherUseCase;
import com.managent.School.core.port.out.UpdateTeacherPort;
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
