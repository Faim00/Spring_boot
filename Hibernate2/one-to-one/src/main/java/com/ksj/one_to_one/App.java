package com.ksj.one_to_one;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answar;
import com.map.Question;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("com/ksj/one_to_one/One-to-One.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Question q1 = new Question();
        q1.setQ_id(101);
        q1.setQuestion("What is java ? ");
        
        Question q2 = new Question();
        q2.setQ_id(102);
        q2.setQuestion("What is hibernate ? ");
        Answar ans = new Answar();
        ans.setAnware_id(301);
        ans.setAnswer("Java Is a programming language");
        
        Answar ans2 = new Answar();
        ans2.setAnware_id(302);
        ans2.setAnswer("Hibernate is a Open Source framwork ");
        
        ans.setQ(q1);
        q1.setAnsware(ans);
        ans2.setQ(q2);
        q2.setAnsware(ans2);
        Session s = factory.openSession();
        s.beginTransaction();
        s.save(q1);
        s.save(ans);
        s.save(q2);
        s.save(ans2);
        s.getTransaction().commit();
        s.close();
        
        

        
    }
}
