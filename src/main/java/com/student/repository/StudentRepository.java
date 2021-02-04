package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
