package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.GetAllStudentUseCase;
import com.managent.School.core.port.out.StudentOut.GetAllStudentPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllStudentService implements GetAllStudentUseCase {
    private final GetAllStudentPort getAllStudentPort;

    @Override
    public List<Student> getAllStudents() {
        return getAllStudentPort.getAllStudents();
    }
}
