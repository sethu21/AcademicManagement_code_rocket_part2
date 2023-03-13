package com.managent.School.core.port.in.teacher;

import com.managent.School.entity.Teacher;

import java.util.List;

public interface GetAllTeacherUseCase {
    List<Teacher> getAllTeacher();
}
