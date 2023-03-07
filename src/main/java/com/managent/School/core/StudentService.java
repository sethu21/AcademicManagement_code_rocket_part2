package com.managent.School.core;

import com.managent.School.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();

    Student getStudentById(long id);

    Student UpdateStudent(Student student, long id);

    void deleteStudent(long id);
}
