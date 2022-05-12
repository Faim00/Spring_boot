package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
@Service
public class EmployeeService {

	     public List<Employee> getEmployee()
	     {
	    	 List<Employee> emplist= new ArrayList<Employee>();
	    	 
	    	 emplist.add(new Employee(1, "Narendra ", "Pune","Manager"));
	    	 return emplist;
	     }
	  
}
