package com.managent.School.repository;

import com.managent.School.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subject,Long> {
}
