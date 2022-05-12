  // Retriving data from Data Base
package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainConnection {

	public static void main(String[] args) throws Exception {
		// Load the Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish the Connection
		Connection con = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "root");
		// Create  Statement Object
		Statement stmt= con.createStatement();
		// Create Result Set Object
		ResultSet rs= stmt.executeQuery("SELECT * FROM EMPLOYEE");
	    // list Object 
		List<Employee> list = new ArrayList<Employee>();
	   // Retriving data from Data Base Table And Storting to Collection
	   while(rs.next())
	   {
		   Employee e= new Employee();
		   e.setId(rs.getInt(1));
		   e.setName(rs.getString(2));
		   
		   e.setSalary(rs.getFloat(3));
		   list.add(e);
	   }
		
		// Retrive  element from list
	   for(Employee e: list)
	   {
		   System.out.println("Employee Id:  "+e.getId());
		   System.out.println("Employee Name:  "+e.getName());
		   System.out.println("Employee Salary  "+e.getSalary());
		   System.out.println();
	   }
  
	}

}
