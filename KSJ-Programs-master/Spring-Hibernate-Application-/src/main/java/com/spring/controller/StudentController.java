package com.spring.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.*;

import com.spring.dao.StudentRepository;
import com.spring.entity.Student;


@RestController
public class StudentController {

	@Autowired
	private StudentRepository stdudentRepository;
	
	Logger logger= LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/")
	public ModelAndView welcome() {
		logger.trace("Now The request coming inside the (/)Controller ");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		logger.debug("index page is displayed");		
		return modelAndView;
	}

	@PostMapping("/register")
	public ModelAndView register(Student student) {
		ModelAndView mav = null;
		  logger.trace("request coming to (/register) controller");
		if (student != null) {
	         logger.trace("now saving the student data");
			stdudentRepository.save(student);
			logger.debug("Data is saved in db successfully");
			
			mav = new ModelAndView();
			mav.setViewName("success.html");
			logger.trace("returnning the success.html page");
		}
		else
			logger.error("Some Error is Occured in while saving data inside db");

		return mav;

	}
}
