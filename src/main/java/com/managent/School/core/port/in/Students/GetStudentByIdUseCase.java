package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Student;

public interface GetStudentByIdUseCase {
    Student getStudentById(long id);
}
