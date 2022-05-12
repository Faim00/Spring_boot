package com.ksj.one_to_one2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Address;
import Entity.User;

public class App 
{
    public static void main( String[] args )
    {
       
    	Configuration cfg = new Configuration();
    	cfg.configure("com/ksj/one_to_one2/config.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session s = factory.openSession();
    	
    	User user1 = new User();
    	user1.setUser_id(101);
    	user1.setName("Fahim");
    	
    	Address User1_Add = new Address();
    	User1_Add.setAd_id(201);
    	User1_Add.setAddress("Aurangabad");
    	
    	user1.setAdd(User1_Add);
    	
    	User user2 = new User();
    	user2.setUser_id(102);
    	user2.setName("Naru");
    	
    	Address User2_Add = new Address();
    	User2_Add.setAd_id(201);
    	User2_Add.setAddress("Pune");
    	
    	user2.setAdd(User2_Add);
    	s.beginTransaction();
        s.save(user1);
 
        s.save(user2);
        s.getTransaction().commit();
        s.close();
    	
    	
    }
    
}
