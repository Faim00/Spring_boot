package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

@RestController
public class EmployeeController {

	  @Autowired
	  EmployeeService employeeService;
	  RestTemplate templet=null;
	  
	@GetMapping(value="/employee")
	  public List<Employee> getEmployee()
	  {
		  List<Employee> emp= employeeService.getEmployee();   
		return emp;

	  }
	  
	  @GetMapping("/getemployeedetails")
	  private String getEmployeeDetails()
	  {
		 // String url=  "http://www.google.com";
		  String url="http://localhost:8080/employee";
		   templet= new RestTemplate();
		  String result=templet.getForObject(url, String.class);
		  return result;
	  }
	  
	  @GetMapping("/getemployee")
	  private Employee getEmployeeObject()
	  {
		  String url="http://localhost:8080/employee";
		 templet= new RestTemplate();
		  Employee result=templet.getForObject(url, Employee.class);
		  return result;
	  }
}
