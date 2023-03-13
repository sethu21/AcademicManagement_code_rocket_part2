package com.managent.School.repository.Adapter.TeacherAdapter;

import com.managent.School.core.port.out.teacherOut.UpdateTeacherPort;
import com.managent.School.entity.Teacher;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateTeacherAdapter implements UpdateTeacherPort {
    private TeacherRepository teacherRepository;
    @Override
    public Teacher updateTeacher(Teacher teacher, Long id) {
        Teacher exisitingTeacher = teacherRepository.findById(id).orElseThrow(()
                ->new ResourceNotFoundException("teacher","id",id));
        exisitingTeacher.setFirstName(teacher.getFirstName());
        exisitingTeacher.setLastName(teacher.getLastName());
        exisitingTeacher.setEmail(teacher.getEmail());
        return teacherRepository.save(teacher);
    }
}
