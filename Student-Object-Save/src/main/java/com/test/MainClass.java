package com.test;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {
	   
		 Scanner sc= new Scanner(System.in);
		
		 Configuration cfg= new Configuration();
		 
		 cfg.configure("com/cfgs/configuration.xml");
		 
		 SessionFactory factory= cfg.buildSessionFactory();
		 
		 Session session = factory.openSession();
		 
		 Transaction txn=null;
		 
		 try {
			// System.out.println("Enter your Id : ");
			 //int id= sc.nextInt();
			 System.out.println("Enter Your Name : ");
			 String name= sc.next();
			 System.out.println("Enter Your Address : ");
			 String address= sc.next();
			 System.out.println("Enter Your Password");
			 String password= sc.next();
			 //set values to student object 
			 Student std= new Student();
		   //std.setId(id);
			 std.setName(name);
			 std.setAddress(address);
			 std.setPassword(password);
			 
			 txn= session.beginTransaction();
			 
			 session.save(std);
			 txn.commit();	
			 System.out.println("Student Record (Object) is Saved into db");
			 
		 }
		 catch(HibernateException he)
		 {
			 he.printStackTrace();
			  txn.rollback();
		 }
	
	}

}
