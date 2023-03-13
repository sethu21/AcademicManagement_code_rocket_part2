package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.SaveStudentPort;
import com.managent.School.entity.Student;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SaveStudentAdapter implements SaveStudentPort {
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
