package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainClass {
 
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 List<Employee> st= new ArrayList<Employee>();
		
		 st.add(new Employee(191, "Narendra",15000.00F));
		 st.add(new Employee(172, "Vikas", 18000.00F));
		 st.add(new Employee(142,"Ashok", 45000.00F));
		 st.add(new Employee(197,"Tanmay", 34000.00F));
		 st.add(new Employee(147,"Sooraj", 38100.00F));
		 st.add(new Employee(167,"Hitesh", 57900.00F));
		 st.add(new Employee(187,"Jayesh", 99000.00F));
		 
		 System.out.println("\n Employee Object Record.....  \n");
		 
		Iterator<Employee> it= st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	 
			System.out.println("How You Want to Sort Your Record ? ");
			System.out.println("\n 1)By Id \n 2)By Name \n 3)By Salary\n");
			System.out.print("Enter Your Choice : ");
			int id= sc.nextInt();
					
			switch(id)
			{
			case 1:   Employee.value=1;
			          break;
			case 2:   Employee.value=2;         
	                  break;
			case 3:   Employee.value=3;         
                      break; 
			default:  Employee.value=4; 
				      System.out.println("Invalid Option !!!!!");           
			} //switch
			
			if(Employee.value==2)
			{
				Collections.sort(st);
				Iterator<Employee> itr2= st.iterator();
		         while(itr2.hasNext())
		         {
		        	 System.out.println(itr2.next());
		         }
				
			}
			else if(Employee.value!=4)
			{
			Collections.sort(st, Collections.reverseOrder());
	        Iterator<Employee> itr2= st.iterator();
	         while(itr2.hasNext())
	         {
	        	 System.out.println(itr2.next());
	         }
			}
	
	  sc.close();		
	}
	 
	 
}
