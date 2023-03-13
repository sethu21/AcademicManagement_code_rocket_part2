package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Student;

public interface AddSubjectToStudentPort {
    Student addSubject(long studentId, long subjectsId);
}
