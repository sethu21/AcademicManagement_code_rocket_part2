package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.UpdateStudentPort;
import com.managent.School.entity.Student;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateStudentAdapter implements UpdateStudentPort {
    private StudentRepository studentRepository;
    @Override
    public Student UpdateStudent(Student student, long id) {
        // we need to check whether student is exist or not
        Student existingStudent = studentRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Student","Id",id));


        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setSubjects(student.getSubjects());
        // save existing database
        studentRepository.save(existingStudent);
        return existingStudent;
    }
}
