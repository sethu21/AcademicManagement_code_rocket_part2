package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.DeleteSubjectForStudentUseCase;
import com.managent.School.core.port.out.StudentOut.DeleteSubjectsForStudentPort;
import com.managent.School.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteSubjectForStudentService implements DeleteSubjectForStudentUseCase {
    private final DeleteSubjectsForStudentPort deleteSubjectsForStudentPort;
    @Override
    public Student deleteSubject(long studentId, long subjectsId) {
        return deleteSubjectsForStudentPort.deleteSubject(studentId,subjectsId);
    }
}
