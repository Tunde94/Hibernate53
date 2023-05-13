package org.example.relations;

import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GeneratedIdMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Parent.class)
                .addAnnotatedClass(Food.class)
                .addAnnotatedClass(Toy.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Parent p1 = new Parent(null,"Mami", Job.ENGINEER);
        Parent p2 = new Parent(null, "Iulia",Job.PROFESSOR);

        session.persist(p1);
        System.out.println(p2.getId());

        session.persist(p2);
        System.out.println(p2.getId());
        transaction.commit();

        session.close();
    }
}
