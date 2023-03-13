package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Student;

public interface UpdateStudentUseCase {
    Student updateStudent(Student student,long id);
}
