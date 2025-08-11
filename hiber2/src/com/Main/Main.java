package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.Entity.Employee;

public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
    
        cfg.addAnnotatedClass(Employee.class); // ✅ Needed only for annotation config

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("✅ Hibernate connection established");

//        insert(session);
        read(session);
//        update(session);
//        delete(session);

        session.close();
        factory.close();
    }

    public static void insert(Session session) {
        Transaction transaction = session.beginTransaction();
        Employee emp = new Employee(11, "Saksham", "Kanpur", 1000);
        session.save(emp);
        transaction.commit();
        System.out.println("✅ Inserted");
    }

    public static void read(Session session) {
        Employee emp = session.get(Employee.class, 11);
        if (emp != null) {
            System.out.println("📄 " + emp);
        } else {
            System.out.println("❌ Data not found");
        }
    }

    public static void update(Session session) {
        Transaction transaction = session.beginTransaction();
        Employee emp = session.get(Employee.class, 11);
        if (emp != null) {
            emp.setEsalary(29229292);
            session.update(emp);
            System.out.println("✅ Data updated");
        } else {
            System.out.println("❌ Data not found");
        }
        transaction.commit();
    }

    public static void delete(Session session) {
        Transaction transaction = session.beginTransaction();
        Employee emp = session.get(Employee.class, 11);
        if (emp != null) {
            session.delete(emp);
            System.out.println("🗑️ Data deleted");
        } else {
            System.out.println("❌ Data not found");
        }
        transaction.commit();
    }
}
