package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Student;

public interface DeleteSubjectsForStudentPort {
    Student deleteSubject(long studentId, long subjectsId);
}
