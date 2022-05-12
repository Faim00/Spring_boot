package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
