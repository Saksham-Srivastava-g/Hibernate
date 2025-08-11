package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.Entity.Employee;

import antlr.collections.List;




public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
       cfg.addAnnotatedClass(Employee.class);
       
        
        SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();

        System.out.println("✅ Hibernate connection established");

//        insert(session);
        update(session);
//        read(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(Session session) {
    	Transaction trs = session.getTransaction();
    	trs.begin();
  	String sql = "INSERT INTO Employee (eid, eaddress, esalary, name) VALUES (:eid, :eaddress, :esalary, :name)";
  	   NativeQuery nativeQuery = session.createNativeQuery(sql);    	   nativeQuery.setParameter("eid", 1991);   	   nativeQuery.setParameter("name", "rahul");
    	   nativeQuery.setParameter("eaddress", "nanital");
    	   nativeQuery.setParameter("esalary", 10000);
    	   nativeQuery.executeUpdate();
    	   System.out.println("DATA INSERTED");
    	
    	
    	
    	

    	
    	
    	 
    	   trs.commit();
    	
    }
        
    

    public static void delete(Session  session){
//    	Transaction trs = session.getTransaction();
//    	trs.begin();
//    	  String sql = "DELETE FROM Employee WHERE eid = :eid";
//    	    NativeQuery<?> query = session.createNativeQuery(sql);
//    	    query.setParameter("eid", 1991);
//
//    	    int rowsDeleted = query.executeUpdate();  // returns how many rows were deleted
//    	trs.commit();
    	 Transaction tx = session.beginTransaction();

    	    String hql = "DELETE FROM Employee WHERE eid = :eid";
    	    Query<?> query = session.createQuery(hql);
    	    query.setParameter("eid", 1991);

    	    int rowsDeleted = query.executeUpdate();
    	    tx.commit();

    	    System.out.println("Rows deleted: " + rowsDeleted);
    	
    	
    }
    
    

public static void read(Session session) {
//    String sql = "SELECT * FROM Employee";
//    
//     NativeQuery nativeQuery = session.createNativeQuery(sql);
//     nativeQuery.addEntity(Employee.class);
//     java.util.List<Employee> list = nativeQuery.getResultList();
//    
//    for (Employee emp : list) {
//        System.out.println(emp);
//    }
//    
    
    
//     hql 
    String hql = " from Employee";
    
    Query query = session.createQuery(hql);
    java.util.List<Employee> list2 = query.list();
    for (Employee emp : list2) {
        System.out.println(emp);
    }
    
}


    public static void update(Session  session){
//    	Transaction trs = session.getTransaction();
//    	trs.begin();
//    	String sql = "UPDATE Employee SET eaddress = :eaddress, esalary = :esalary,name=:name WHERE eid = :eid";
//        NativeQuery<?> query = session.createNativeQuery(sql);
//        query.setParameter("eaddress", "baghladesh");
//        query.setParameter("esalary", 10);
//        query.setParameter("name", "pinku");
//        query.setParameter("eid", 1991);
//        query.executeUpdate();
//        System.out.println("DATA UPDATED");
//        
//    	trs.commit();
    	
//    	hql 
    	 Transaction tx = session.beginTransaction();

    	    String hql = "UPDATE Employee SET eaddress = :address, esalary = :salary, name = :name WHERE eid = :eid";
    	    Query<?> query = session.createQuery(hql);
    	    query.setParameter("address", "Delhi");
    	    query.setParameter("salary", 5000);
    	    query.setParameter("name", "Pinkuuuuuuuu");
    	    query.setParameter("eid", 1991);

    	    int rowsUpdated = query.executeUpdate();
    	    tx.commit();

    	    System.out.println("Rows updated: " + rowsUpdated);
    }
    	
}
