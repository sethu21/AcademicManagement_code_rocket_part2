package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.GetAllStudentPort;
import com.managent.School.entity.Student;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class GetAllStudentAdapter implements GetAllStudentPort {
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
