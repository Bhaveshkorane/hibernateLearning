package com.bhavesh;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hey Bhavesh How are you doing? is everything ok buddy?" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //Creating student 
        Student st = new Student();
        st.setId(101);
        st.setName("Bhavesh");
        st.setCity("Kolhapur");
        System.out.println(st);
        
        
        //Creating address
        Address ad = new Address();
        ad.setStreet("Street1");
        ad.setCity("Kolhapur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.432);
        
        FileInputStream fis = new FileInputStream("src/main/java/after_processing.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
        
        
//      Session session  =factory.getCurrentSession();
        Session session =factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit(); 
        session.close();
        
        System.out.println("Done");
        
    }
}
