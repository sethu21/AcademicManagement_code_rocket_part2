package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.SaveStudentUseCase;
import com.managent.School.core.port.out.StudentOut.SaveStudentPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SaveStudentService implements SaveStudentUseCase {
    private final SaveStudentPort saveStudentPort;
    @Override
    public Student saveStudent(Student student) {
        return saveStudentPort.saveStudent(student);
    }
}
