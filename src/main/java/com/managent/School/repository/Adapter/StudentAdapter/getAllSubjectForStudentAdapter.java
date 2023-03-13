package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.GetAllSubjectForStudentPort;
import com.managent.School.entity.Student;
import com.managent.School.entity.Subject;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class getAllSubjectForStudentAdapter implements GetAllSubjectForStudentPort {
    private StudentRepository studentRepository;
    @Override
    public List<Subject> getAllSubjectsForStudent(long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", studentId));
        List<Subject> subjects = (List<Subject>) student.getSubjects();
        return subjects;
    }
}
