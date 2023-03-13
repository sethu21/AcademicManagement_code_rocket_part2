package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Student;

public interface SaveStudentUseCase {
    Student saveStudent(Student student);
}
