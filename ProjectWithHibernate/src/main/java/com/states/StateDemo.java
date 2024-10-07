package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhavesh.Certificate;
import com.bhavesh.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Transient 
		
		//Persistent
		
		//Detached
		
		//Removed
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		//Creating Student object 
		Student student = new Student(); 
		
		student.setId(101);
		student.setName("Bhavesh");
		student.setCity("kolhapur");
		student.setCerti(new Certificate("java_hibernate","3 months"));
		//Student : in Transient State
		
		Session s = f.openSession();
		
		s.save(s);
		//Student : in persistent state
		
		
		
		
		
		
		f.close();
	}

}
