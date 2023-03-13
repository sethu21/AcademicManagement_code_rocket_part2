package com.managent.School.repository;

import com.managent.School.entity.Student;
import com.managent.School.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;


public interface StudentRepository extends JpaRepository<Student,Long> {


}
