package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.GetStudentByIdUseCase;
import com.managent.School.core.port.out.StudentOut.GetStudentByIdPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetStudentByIdService implements GetStudentByIdUseCase {
    private final GetStudentByIdPort getStudentByIdPort;
    @Override
    public Student getStudentById(long id) {
        return getStudentByIdPort.getStudentById(id);
    }
}
