package com.ksj.Many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Employees;
import entity.Project;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("com/ksj/Many_to_many/configfile.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session s = factory.openSession();
    	
    	Employees emp = new Employees();
    	Employees emp2 = new Employees();
    	
    	emp.setEmp_id(101);
    	emp.setName("Narendra");
    	
    	emp2.setEmp_id(102);
    	emp2.setName("Purushottam");
    	
    	Project p1 = new Project();
    	Project p2 = new Project();
    	
    	p1.setPid(201);
    	p1.setProjectName("ATS");
    	
    	p2.setPid(202);
    	p2.setProjectName("Ats FrontEnd");
    	
    	List<Employees> list1 = new ArrayList<Employees>();
    	List<Project>   list2 = new ArrayList<Project>();
    	
    	list1.add(emp);
    	list1.add(emp2);
    	list2.add(p1);
    	list2.add(p2);
    	
    	emp.setProject(list2);
    	p2.setEmp(list1);
    	
    	Transaction tx = s.beginTransaction();
    	s.save(emp);
    	s.save(emp2);
    	s.save(p1);
    	s.save(p2);
    	
    	tx.commit();
    	s.close();
    	factory.close();
    }
}
