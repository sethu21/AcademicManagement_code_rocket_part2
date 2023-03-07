package com.managent.School.core.port.out;

import com.managent.School.entity.Teacher;

public interface UpdateTeacherPort {
    Teacher updateTeacher(Teacher teacher,Long id);
}
