package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;




public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
       cfg.addAnnotatedClass(Employee.class);
       
        
        SessionFactory factory = cfg.buildSessionFactory();
        StatelessSession  session = factory.openStatelessSession();

        System.out.println("✅ Hibernate connection established");

//        insert(session);
//        update(session);
//        read(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(StatelessSession  session) {
        Employee emp = new Employee(121, "Saksham", "Kanpur", 1000);
        Transaction transaction = session.beginTransaction();
        session.insert(emp);
        transaction.commit();
    }

    public static void delete(StatelessSession  session){
    	 Transaction transaction = session.beginTransaction();
   	  Employee emp = (Employee) session.get(Employee.class,11);  
   	  if(emp!=null) {
   		 session.delete(emp);
   		  System.out.println("data deleted");
   		  
   	  }
   	  else {
   		  System.out.println("DATA NOT FOUND");
   		  
   	  }
   	  transaction.commit();
       
   }  
    

    public static void read(StatelessSession  session) {
    	

    	
       Employee emp = (Employee)session.get(Employee.class,121);
       System.out.println(emp);
    }

    public static void update(StatelessSession  session){
    	 Transaction transaction = session.beginTransaction();
    	  Employee emp = (Employee)session.get(Employee.class,11);  
    	  if(emp!=null) {
    		  emp.setEsalary(29229292);
    		  session.update(emp);
    		  System.out.println("data updated");
    		  
    	  }
    	  else {
    		  System.out.println("DATA NOT FOUND");
    		  
    	  }
    	  transaction.commit();
        
    }  
}
