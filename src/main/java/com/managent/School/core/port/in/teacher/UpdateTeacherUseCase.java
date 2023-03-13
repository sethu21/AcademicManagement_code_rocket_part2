package com.managent.School.core.port.in.teacher;

import com.managent.School.entity.Teacher;

public interface UpdateTeacherUseCase {
    Teacher updateTeacher(Teacher teacher,Long id);
}
