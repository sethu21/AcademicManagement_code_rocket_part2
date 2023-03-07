package com.managent.School.repository.Adapter;

import com.managent.School.core.port.out.SaveTeacherPort;
import com.managent.School.entity.Teacher;
import com.managent.School.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SaveTeacherAdapter implements SaveTeacherPort {
    private TeacherRepository teacherRepository;
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
