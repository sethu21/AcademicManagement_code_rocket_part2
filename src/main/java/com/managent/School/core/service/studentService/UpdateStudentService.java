package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.UpdateStudentUseCase;
import com.managent.School.core.port.out.StudentOut.UpdateStudentPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateStudentService implements UpdateStudentUseCase {
    private final UpdateStudentPort updateStudentPort;
    @Override
    public Student updateStudent(Student student, long id) {
        return updateStudentPort.UpdateStudent(student,id);
    }
}
