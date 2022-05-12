package com.spring.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.spring.entity.Student;

public interface IStudentService {

	public List<Student> getStudent();
	
	public String addStudent(@RequestBody Student std);

	public Student findById(int id);
}
