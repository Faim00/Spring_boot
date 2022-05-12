package com.h2.intf;

import org.springframework.data.repository.CrudRepository;

import com.h2.module.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
	

}
