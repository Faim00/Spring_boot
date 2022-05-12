package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	  
	public static void main(String[] args)  {
	 	 
	 	  Scanner sc= new Scanner(System.in);
	 	  System.out.println("What Operation You Want to Perform ?\n"
	 	  	             	+ "=========================================== "
	 	  		            + "\n 1)Insert Record \n 2) Retrive Record\n 3) Exit \n"
	 	  		            + "Enter Your Choice \t:");
	 	  int option= sc.nextInt();

	 	  switch(option)
	 	  {
	 	  case 1: insert();
	 	           break;
	 	  case 2:  retrive();
	 	           break;
	 	  case 3: System.exit(0);
	 	          break;
	 	  default: System.out.println("invalid Option");
	 	           break;
	 	  }
	
	  
	 	  
	} //main Method
	 
	public static void insert() {
		int id = 0;
		String name = null;
		float salary = 0.0F;
        Scanner sc= new Scanner(System.in);
        List<Employee> list = new ArrayList<Employee>();
        
        System.out.println("How Many Record Want to Insert? ");
        int record= sc.nextInt();
        for(int i=1; i<=record; i++)
        {
         System.out.println("\n You Are Inserting Your "+i+" Out Of "+record);
        System.out.print("Enter You ID\t:");
        id=sc.nextInt();
        System.out.print("Enter Your Name\t:");
        name=sc.next();
        System.out.print("Enter Salary\t:");
        salary= sc.nextFloat();
        
		Employee emp= new Employee();
		list.add(new Employee(id, name, salary));
        }//for
		try (Connection con = DBConnection.getConnection(); Statement stmt = con.createStatement();) {
			for (Employee e : list) {
				id = e.getId();
				name = e.getName();
				salary = e.getSalary();
				stmt.addBatch(
						"INSERT INTO EMPLOYEE (ID,NAME,SALARY) VALUES (" + id + ",'" + name + "'," + salary + ")");
			}

			int[] result = stmt.executeBatch();
			boolean flag = true;

			for (int i = 0; i < result.length; ++i) {
				if (result[i] == 0) {
					flag = false;
					break;
				}
			}

			if (flag)
				System.out.println(result.length + "   Record Stored Successfully");
			else
				System.out.println("Record is Not Stored !!!!");
		} // try
		catch (SQLException sql) {
			sql.printStackTrace();
		} // catch 
	}
	 
	public static void retrive()
	{
		try(Connection con = DBConnection.getConnection();
			Statement stmt= con.createStatement();
		     ResultSet rs= stmt.executeQuery("SELECT * FROM EMPLOYEE GROUP BY ID");)
		{
			   // list Object 
				List<Employee> list = new ArrayList<Employee>();
			   // Retriving data from Data Base Table And Storting to Collection Object
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
		}//try
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}// catch
		  	
	}// retrive method
} // class-end
