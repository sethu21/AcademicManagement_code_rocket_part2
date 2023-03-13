package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Student;

import java.util.List;

public interface GetAllStudentPort {
    List<Student> getAllStudents();
}
