package com.ksj.One_To_Many;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Question;
import entity.Answer;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration();
    	 cfg.configure("com/ksj/One_To_Many/config.xml");
    	 SessionFactory factory = cfg.buildSessionFactory();
    	 Session s = factory.openSession();
    	
    	 Question q1 = new Question();
         q1.setQ_id(101);
         q1.setQuestion("What is java ? ");
     
         Answer ans = new Answer();
         ans.setAns_id(201);
         ans.setAnswer("Java Is a programming language");
         ans.setQuestion(q1);
         
         Answer ans2 = new Answer();
         ans2.setAns_id(202);
         ans2.setAnswer("Java has different type of framwork");
         ans2.setQuestion(q1);
       
         Answer ans3 = new Answer();
         ans3.setAns_id(203);
         ans3.setAnswer("We can build different type of application using java");
         ans3.setQuestion(q1);
         
         List<Answer> list = new ArrayList<Answer>();
         
         list.add(ans);
         list.add(ans2);
         list.add(ans3);
         q1.setAnswer(list);
         
         Transaction tx = s.beginTransaction();
         s.save(q1);
         s.save(ans);
         s.save(ans2);
         s.save(ans3);
         tx.commit();
         s.close();
         
         factory.close();
        
    }
}
