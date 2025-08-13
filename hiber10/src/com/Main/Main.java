package com.Main;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Account;

import com.Entity.Employee;





public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.addAnnotatedClass(Account.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("✅ Hibernate connection established");

        insert(session);
//          readFromEmployee(session);
//          readFromAccount(session);
//        update(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(Session session) {
        Transaction transaction = session.beginTransaction();
         Account account1 = new Account("121assbc","rajuacc","kanpur","Sbi","acbcdefgh");
         Account account2 = new Account("121abc","rajuacc","kanpur","Sbi","acbcdefgh");
         Account account3 = new Account("121asssbc","rajuacc","kanpur","Sbi","acbcdefgh");
         List<Account> account = Arrays.asList(account1,account2,account3);
         Employee employee = new Employee("eid1234","raju",account);
//         account.setEmployee(employee);
         session.save(employee);
        transaction.commit();
        System.out.println("✅ Inserted");
    }

    public static void readFromEmployee(Session session) {
    	Employee employee = session.get(Employee.class,"eid1234");
    	System.out.println(employee);
    	

        
    }
   public static void readFromAccount(Session session) {
//	   Account account = session.get(Account.class,"121abc");
//	   System.out.println(account.getAccNo());
//	   System.out.println(account.getAccountHolderAddress());
//	   System.out.println(account.getAccountHolderAddress());
//	   System.out.println(account.getBankName());
//	   System.out.println(account.getIfsc() );
//	   
//	   System.out.println(account.getEmployee().getEmployeeId());
//	   System.out.println(account.getEmployee().getEmployeeName());
		 
	 
    }

 
    public static void update(Session session) {
         
    }

    public static void delete(Session session) {
       
    }
}
