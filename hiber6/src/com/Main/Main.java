package com.Main;



import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Account;
import com.Entity.Car;
import com.Entity.Company;
import com.Entity.Employee;





public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("✅ Hibernate connection established");

        insert(session);
//        readHql(session);
//        update(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(Session session) {
        Transaction transaction = session.beginTransaction();
         Account account = new Account("123456","saksham","kanpur","sbi","SBIN999");
         Car car = new Car("dl998","nanital",LocalDateTime.now(),233);
         Company company = new Company("2234","google","policy only",account);
         Employee employee = new Employee("2345","saksham",company,car);
          session.save(employee);
        transaction.commit();
        System.out.println("✅ Inserted");
    }

    public static void readSql(Session session) {
    	
    	
        
    }
   public static void readHql(Session session) {
	   
	 
    }


    public static void update(Session session) {
         
    }

    public static void delete(Session session) {
       
    }
}
