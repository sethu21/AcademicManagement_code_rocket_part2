package com.managent.School.core.service.TeacherService;

import com.managent.School.core.port.in.teacher.DeleteTeacherUseCase;
import com.managent.School.core.port.out.teacherOut.DeleteTeacherPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteTeacherService implements DeleteTeacherUseCase {
    private DeleteTeacherPort deleteTeacherPort;
    @Override
    public void deleteTeacher(long id) {
          deleteTeacherPort.deleteTeacher(id);

    }
}
