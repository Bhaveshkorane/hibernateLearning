package com.bhavesh;
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
    public static void main( String[] args )
    {
        System.out.println( "Hey Bhavesh How are you doing? is everything ok buddy?" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //Creating student 
        Student st = new Student();
        st.setId(101);
        st.setName("Bhavesh");
        st.setCity("Kolhapur");
        
        System.out.println(st);
        
//        Session session  =factory.getCurrentSession();
        Session session =factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit(); 
        session.close();
        
    }
}
