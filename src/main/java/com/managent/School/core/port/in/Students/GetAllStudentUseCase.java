package com.managent.School.core.port.in.Students;

import com.managent.School.entity.Student;

import java.util.List;

public interface GetAllStudentUseCase {
    List<Student> getAllStudents();
}
