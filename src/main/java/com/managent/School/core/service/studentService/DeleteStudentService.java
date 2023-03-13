package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.DeleteStudentUseCase;
import com.managent.School.core.port.out.teacherOut.DeleteTeacherPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteStudentService implements DeleteStudentUseCase{
    private final DeleteTeacherPort deleteTeacherPort;


    @Override
    public void deleteStudent(long id) {
        deleteTeacherPort.deleteTeacher(id);

    }
}
