package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.AddSubjectToStudentPort;
import com.managent.School.entity.Student;
import com.managent.School.entity.Subject;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import com.managent.School.repository.SubjectsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AddSubjectToStudentAdapter implements AddSubjectToStudentPort {
    private StudentRepository studentRepository;
    private SubjectsRepository subjectsRepository;
    @Override
    public Student addSubject(long studentId, long subjectsId) {
        // Retrieve the Student entity from the repository
        Student student = studentRepository.findById(studentId).orElseThrow(() ->
                new ResourceNotFoundException("Student", "Id", studentId));
        // retrieve the subject from the repository
        Subject subject = subjectsRepository.findById(subjectsId).orElseThrow(()
                ->new ResourceNotFoundException("subject","id",subjectsId));
        // Add the Subject entity to the Student's subjects set
        student.getSubjects().add(subject);

        // Save the updated Student entity
        studentRepository.save(student);

        return student;
    }
}
