package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Subject;

import java.util.List;
import java.util.Set;

public interface GetAllSubjectForStudentUseCase {
    List<Subject> getAllSubjectsForStudent(long studentId);
}
