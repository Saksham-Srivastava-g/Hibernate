package com.Main;

import java.util.List;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.Entity.Cricketer;
import com.Entity.Footballer;
import com.Entity.Player;


public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Player.class);
        cfg.addAnnotatedClass(Footballer.class);
        cfg.addAnnotatedClass(Cricketer.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("✅ Hibernate connection established");

//        insert(session);
        readHql(session);
//        update(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(Session session) {
        Transaction transaction = session.beginTransaction();
        Cricketer cricketer = new Cricketer(123,"raju",1000,"wk");
        Footballer footballer = new Footballer(125,"saksham",70,"attacker");
        session.save(footballer);
        session.save(cricketer);
        
        
        transaction.commit();
        System.out.println("✅ Inserted");
    }

    public static void readSql(Session session) {
    	String sql = "select * from Cricketer UNION select * from Footballer";
    	NativeQuery nativeQuery = session.createNativeQuery(sql);
    	List<Object[]> list = nativeQuery.getResultList();
    
    	for(Object[] arr : list) {
    		
    		for(Object o : arr) {
    			System.out.print(o+" " );
    		}
    		System.out.println();
    	}
    	
        
    }
   public static void readHql(Session session) {
	   
	   String hql = " from Player  ";
	   Query query = session.createQuery(hql);
	   List<Player> list = query.list();
//	   System.out.println(list);
         for(Player p : list) {
        	 if(p instanceof Cricketer ) {
        		 System.out.println(p);
        	 }
        	 else {
        		 System.out.println(p);
        	 }
         }
    }


    public static void update(Session session) {
         
    }

    public static void delete(Session session) {
       
    }
}
