package com.managent.School.core.port.out.teacherOut;

import com.managent.School.entity.Teacher;

public interface UpdateTeacherPort {
    Teacher updateTeacher(Teacher teacher,Long id);
}
