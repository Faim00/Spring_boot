package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.controller.PayrollSystemController;
import com.nit.model.Employee;

@SpringBootApplication
public class SpringBootLayredAppApplication {

	public static void main(String[] args) {
		
// get ioc container 
	ApplicationContext ctx= SpringApplication.run(SpringBootLayredAppApplication.class, args);
//	get Controller Class Object
	PayrollSystemController controller = ctx.getBean("controller", PayrollSystemController.class);
//	gather inputs from end-user
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter Designation  1   : ");
	String desg1=  sc.next().toUpperCase();
	
	System.out.print("Enter Designation 2    : ");
	String desg2= sc.next().toUpperCase();
	
	System.out.print("Enter Designation 3    :");
	String desg3= sc.next().toUpperCase();
	
//	invoke method
	
	try {
		List<Employee> listemps= controller.showEmpsDetailsByDesgs(desg1, desg2, desg3);
		
		for(Employee e:listemps)
			System.out.println(e);
	}//try
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	}

}
