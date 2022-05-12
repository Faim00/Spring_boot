package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.StudentRepository;
import com.spring.entity.Student;
@Controller
public class StudentController {

	@Autowired
	private StudentRepository std;
	
	@GetMapping("/")
	public String mainPage(Model model)
	{
		model.addAttribute("student", new Student());
		return "index";
	}
	
	@PostMapping("/register")
	public String registerStudent(Student student)
	{
		std.save(student);
		
		return"success";
	}
}
