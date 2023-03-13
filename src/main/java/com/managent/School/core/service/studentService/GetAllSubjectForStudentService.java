package com.managent.School.core.service.studentService;

import com.managent.School.core.port.in.Students.GetAllSubjectForStudentUseCase;
import com.managent.School.core.port.out.StudentOut.GetAllSubjectForStudentPort;
import com.managent.School.entity.Subject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class GetAllSubjectForStudentService implements GetAllSubjectForStudentUseCase {
    private final GetAllSubjectForStudentPort getAllSubjectForStudentPort;


    @Override
    public List<Subject> getAllSubjectsForStudent(long studentId) {
        return  getAllSubjectForStudentPort.getAllSubjectsForStudent(studentId);
    }
}
