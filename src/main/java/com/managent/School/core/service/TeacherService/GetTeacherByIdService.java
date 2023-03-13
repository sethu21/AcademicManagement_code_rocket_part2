package com.managent.School.core.service.TeacherService;

import com.managent.School.core.port.in.teacher.GetTeacherById;
import com.managent.School.core.port.out.teacherOut.GetTeacherByIdPort;
import com.managent.School.entity.Teacher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetTeacherByIdService implements GetTeacherById {
    private GetTeacherByIdPort getTeacherByIdPort;
    @Override
    public Teacher getTeacherById(long id) {
        return getTeacherByIdPort.getTeacherById(id);
    }
}
