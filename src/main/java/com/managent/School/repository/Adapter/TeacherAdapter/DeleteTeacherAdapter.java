package com.managent.School.repository.Adapter.TeacherAdapter;

import com.managent.School.core.port.out.teacherOut.DeleteTeacherPort;
import com.managent.School.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteTeacherAdapter implements DeleteTeacherPort {
    private TeacherRepository teacherRepository;
    @Override
    public void deleteTeacher(long id) {
         teacherRepository.deleteById(id);

    }
}
