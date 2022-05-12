package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;
import com.spring.service.IStudentService;

@RestController
public class MainController {

	@Autowired
	private IStudentService service;
	 
	@GetMapping(value="/student")
	public List<Student> getStud()
	{
	    List<Student> std= service.getStudent();
	    return std;
	}

	 @PostMapping("/addstudents")
	 public String addStudents(@RequestBody Student std)
	 {
		 return service.addStudent(std);
	 }
	 
	 @GetMapping("/student/{id}")
	 public Student getStudentById(@PathVariable int id)
	 {
		 return service.findById(id);
	 } 
	 
	 
	
}
