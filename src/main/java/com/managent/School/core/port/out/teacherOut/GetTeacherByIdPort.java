package com.managent.School.core.port.out.teacherOut;

import com.managent.School.entity.Teacher;

public interface GetTeacherByIdPort {
    Teacher getTeacherById(long id);
}
