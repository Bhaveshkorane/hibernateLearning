package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();

	    Employee e1 =  new Employee();
	    Employee e2 = new Employee();
	    
	    e1.setEid(51);
	    e1.setName("Bhavesh");
	    
	    e2.setEid(52);
	    e2.setName("Aniket");
	    
	    Project p1 = new Project();
	    Project p2 = new Project();
	    
	    p1.setPid(101);
	    p1.setName("NSDC");
	    
	    p2.setPid(102);
	    p2.setName("Enmasse");
	    
	    List<Employee> list1 = new ArrayList<Employee>();
	    List<Project> list2 = new ArrayList<Project>();
	    
	    list1.add(e1);
	    list1.add(e2);
	    
	    list2.add(p1);
	    list2.add(p2);
	    
	    
	    e1.setProjects(list2);
	   
	    p2.setEmployees(list1);
	    
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    
	  
	    
	    s.save(e1);
	    s.save(e2);
	    s.save(p1);
	    s.save(p2);
	    
	    tx.commit();
	    s.close();  
	    
	}

}
