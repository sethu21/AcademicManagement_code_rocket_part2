package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Student;

public interface GetStudentByIdPort {
    Student getStudentById(long id);
}
