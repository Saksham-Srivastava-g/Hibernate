package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // This automatically reads hibernate.properties from classpath
        Configuration configuration = new Configuration();
        configuration.configure();
        
        
        
        // Optionally register annotated class here if you have entities
        // configuration.addAnnotatedClass(YourEntity.class); // <-- skip if you just want to test connection

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("✅ Hibernate session created successfully.");

        session.close();
        sessionFactory.close();
    }
}
