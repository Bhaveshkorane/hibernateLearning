package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String args[]) {
		
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    
	    
	    //Creating question 
	    Question q1 = new Question();
	    q1.setQuestionId(1);
	    q1.setQustion("What is Java?");
	    
	    //Create new answer 
	    Answer answer = new Answer();
	    answer.setAnswerId(343);
	    answer.setAnswer("Java is programming language");
	    answer.setQuestion(q1);
	    
	    Answer answer1 = new Answer();
	    answer1.setAnswerId(344);
	    answer1.setAnswer("Java is used to write porgrams");
	    answer1.setQuestion(q1);
	    
	    Answer answer2 = new Answer();
	    answer2.setAnswerId(345);
	    answer2.setAnswer("Java has many used and implementations");
	    answer2.setQuestion(q1);
	    
	    
	    List<Answer> list = new ArrayList<Answer>();
	    list.add(answer);
	    list.add(answer1);
	    list.add(answer2);
	    
	    q1.setAnswer(list);
	    
	    
	    
	   
	    
	    //Session
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    s.save(answer2);
	    s.save(answer1);
	    s.save(answer);
	    
	    s.save(q1);
	  
	    tx.commit();
	    s.close();
	    factory.close();
		
	}

}
