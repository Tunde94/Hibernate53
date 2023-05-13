package org.example.exercitiu2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ex2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")//numele fisierului din care incarcam configurarea
                .addAnnotatedClass(Student.class)//hei! fii atent! vreau sa-mi creezi si o entitate de tip Student
                .buildSessionFactory();
        Session session = sessionFactory.openSession();//sessiune de comunicare

        Transaction transaction = session.beginTransaction();
        Student student1 = new Student(1,"Mihai", 1994);//asta este un obiect pe care vreau sa-l salvez
        session.persist(student1);
        transaction.commit();

        session.close();//mereu trebuie sa inchidem sessiunea ca sa nu ocupa loc in memorie
    }
}
