package com.managent.School.core.service;

import com.managent.School.entity.Subject;

import java.util.List;

public interface SubjectService {
    // Create a new subject
    Subject saveSubject(Subject subject);

    // Get all subjects
    List<Subject> getAllSubjects();

    // Get a subject by id
    Subject getSubjectById(long id);

    // Update a subject
    Subject updateSubject(Subject subject, long id);

    // Delete a subject
    void deleteSubject(long id);
}
