package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.AddSubjectToStudentUseCase;
import com.managent.School.core.port.out.StudentOut.AddSubjectToStudentPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddSubjectToStudentService implements AddSubjectToStudentUseCase {
private final AddSubjectToStudentPort addSubjectToStudentPort;

    @Override
    public Student addSubject(long studentId, long subjectsId) {
        return addSubjectToStudentPort.addSubject(studentId,subjectsId);
    }
}
