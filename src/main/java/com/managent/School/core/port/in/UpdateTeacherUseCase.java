package com.managent.School.core.port.in;

import com.managent.School.entity.Teacher;

public interface UpdateTeacherUseCase {
    Teacher updateTeacher(Teacher teacher,Long id);
}
