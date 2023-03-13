package com.managent.School.repository.Adapter.StudentAdapter;

import com.managent.School.core.port.out.StudentOut.DeleteStudentPort;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteStudentAdapter implements DeleteStudentPort {
    private StudentRepository studentRepository;
    @Override
    public void deleteStudent(long id) {
        //check student exist or not

        studentRepository.findById(id).orElseThrow(()
                ->new ResourceNotFoundException("Student","id",id));


        studentRepository.deleteById(id);

    }
}
