package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainInsertion {

	public static void main(String[] args) throws SQLException {
	 	  int id;
	 	  String name;
	 	  float salary;
         List<Employee> list =  new ArrayList<Employee>();
         
         list.add(new Employee(24, "Jay", 10000.00F));
         list.add(new Employee(25, "Harsha", 12000.00F));
         list.add(new Employee(26, "Karan", 19000.00F));
         list.add(new Employee(27, "Mangesh", 17000.00F));
         // Establish The Connection 
           Connection con= MainInsertion.getConnection();
         // Create Statement Object 
         Statement stmt= con.createStatement();
         for(Employee e: list)
         {
        	 id= e.getId();
             name= e.getName();
        	 salary=e.getSalary();
        	 stmt.addBatch("INSERT INTO EMPLOYEE (ID,NAME,SALARY) VALUES ("+id+",'"+name+"',"+salary+")");
         }
         
         int[] result= stmt.executeBatch();
         boolean flag=true;
         
         for(int i=0; i<result.length;++i)
         {
              if(result[i]==0)
              {
            	   flag=false;
            	   break;
              }
         }
         
         if(flag)
        	 System.out.println(result.length+ "   Record Stored Successfully");
         else
        	 System.out.println("Record is Not Stored !!!!");

	}
	
	 private static Connection getConnection() 
	 {
		 Connection con=null;
		 try {
		  con = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "root");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return con;
	 }
	
	}
