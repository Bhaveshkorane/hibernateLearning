package com.bhavesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emdemo {
	
	public static void main(String [] args)
	{
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    
	    Student student1 = new Student();
	    
	    student1.setId(102);
	    student1.setName("Aniket");
	    student1.setCity("Chandgad");
	    
	    Certificate certificate = new Certificate();
	    certificate.setCourse("Spring boot");
	    certificate.setDuration("3 months");
	    
	    student1.setCerti(certificate);
	    
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    
	    //save objects
	    s.save(student1);
	    tx.commit();
	    s.close();
	    
	    factory.close();
		
	}
	
	

}
