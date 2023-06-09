package org.example.relations;

import org.example.database.DataBaseConfig;
import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GeneratedIdMain {
    public static void main(String[] args) {
        /*SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Parent.class)
                .addAnnotatedClass(Food.class)
                .addAnnotatedClass(Toy.class)
                .addAnnotatedClass(Hobby.class)
                .buildSessionFactory();*/

        Session session = DataBaseConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Mother p1 = new Mother(null,"Mami", Job.ENGINEER);
        Mother p2 = new Mother(null, "Iulia",Job.PROFESSOR);


        session.persist(p1);
        System.out.println(p2.getId());

        session.persist(p2);
        System.out.println(p2.getId());
        transaction.commit();

        session.close();
    }
}
