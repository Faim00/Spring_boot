package com.ksj.Mobile_charger;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Charger;
import entity.Mobiles;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("com/ksj/Mobile_Charger/config.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session s = factory.openSession();
    	
    	Mobiles m1 = new Mobiles();
    	Mobiles m2 = new Mobiles();
    	
    	Charger ch1 = new Charger();
    	Charger ch2 = new Charger();
    	
    	List<Charger> list1 = new ArrayList<Charger>();
    	List<Mobiles> list2 = new ArrayList<Mobiles>();
    	
    	m1.setM_id(1022);
    	m1.setM_Name("Vivo");
    	
    	m2.setM_id(1023);
    	m2.setM_Name("Samsung");
    	
        ch1.setC_id(101);
        ch1.setC_Name("Redmi");
    	
    	ch2.setC_id(102);
    	ch2.setC_Name("OnePluse");

    	
    	list1.add(ch1);
    	list1.add(ch2);
    	
    	list2.add(m1);
    	list2.add(m2);
    	
    	m1.setChargers(list1);
    	ch2.setMobiles(list2);
    	
    	Transaction tx = s.beginTransaction();
    	s.save(m1);
    	s.save(m2);
    	
    	s.save(ch1);
    	s.save(ch2);
    	
    	tx.commit();
    	s.close();
    	factory.close();
    
    }
}
