package com.managent.School.core.Impl;

import com.managent.School.core.service.SubjectService;
import com.managent.School.entity.Subject;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.SubjectsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private SubjectsRepository subjectsRepository;

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectsRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectsRepository.findAll();
    }

    @Override
    public Subject getSubjectById(long id) {
        Optional<Subject> subject = subjectsRepository.findById(id);
        if (subject.isPresent()){
            return subject.get();
        }else {
            throw new ResourceNotFoundException("Subject","id",id);
        }
    }

    @Override
    public Subject updateSubject(Subject subject, long id) {
        // we need to check subject exist
        Subject existingSubject = subjectsRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Subject","id",id));

        existingSubject.setId(subject.getId());
        existingSubject.setName(subject.getName());

        subjectsRepository.save(existingSubject);
        return existingSubject;


    }

    @Override
    public void deleteSubject(long id) {

        subjectsRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Subject","id",id));

         subjectsRepository.deleteById(id);

    }
}
