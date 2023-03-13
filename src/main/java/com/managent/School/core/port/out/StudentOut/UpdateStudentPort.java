package com.managent.School.core.port.out.StudentOut;

import com.managent.School.entity.Student;

public interface UpdateStudentPort {
    Student UpdateStudent(Student student, long id);
}
