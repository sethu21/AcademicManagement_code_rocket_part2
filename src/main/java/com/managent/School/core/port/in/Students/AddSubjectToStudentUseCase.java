package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Student;

public interface AddSubjectToStudentUseCase {
    Student addSubject(long studentId,long subjectsId);
}
