package com.managent.School.core.Impl;

import com.managent.School.entity.Student;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.StudentRepository;
import com.managent.School.core.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        Optional <Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }else {
            throw new ResourceNotFoundException("Student","Id",id);
        }
    }

    @Override
    public Student UpdateStudent(Student student, long id) {
        // we need to check whether student is exist or not
        Student existingStudent = studentRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Student","Id",id));


        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        // save existing database
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    @Override
    public void deleteStudent(long id) {
        //check student exist or not

        studentRepository.findById(id).orElseThrow(()
                ->new ResourceNotFoundException("Student","id",id));


        studentRepository.deleteById(id);
    }
}
