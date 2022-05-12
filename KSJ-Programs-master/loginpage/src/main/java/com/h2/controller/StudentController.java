package com.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.h2.intf.StudentRepo;
import com.h2.module.Student;
@Controller
public class StudentController {
	@Autowired
	 StudentRepo repo;
	@RequestMapping("/home")
	public String homePage()
	{
		return "home.html";
	}
	@RequestMapping("/addstudent")
	public String result(Student student)
	{
		 repo.save(student);
		return "insert.html";
	}
	
	

}
