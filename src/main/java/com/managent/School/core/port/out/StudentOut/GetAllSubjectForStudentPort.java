package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Subject;

import java.util.List;

public interface GetAllSubjectForStudentPort {
    List<Subject> getAllSubjectsForStudent(long studentId);
}
