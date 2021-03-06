package com.myDemoKsj.myDemoHib;

import java.util.Scanner;
\
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.EmpDetail;

public class App 
{
    public static void main( String[] args )
    {
        
    	Scanner sc = new Scanner(System.in);
        Configuration cfg = new Configuration();
        cfg.configure("com/myDemoKsj/myDemoHib/confg.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter Sallery:");
        int sall = sc.nextInt();

        EmpDetail emp = new EmpDetail();
        emp.setId(id);
        emp.setName(name);
        emp.setAge(age);
        emp.setSall(sall);
       System.out.println(emp);
       
       Session session = factory.openSession();
       
       // Transaction tx = session.beginTransaction();
       // or
       
       session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        
       session.close();

       
       //       System.out.println(session);
//       System.out.println(session.isClosed());
               
    }
}
