package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.GetStudentByIdPort;
import com.managent.School.entity.Student;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class GetStudentByIdAdapter implements GetStudentByIdPort {
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new ResourceNotFoundException("Student", "Id", id);
        }
    }
}
