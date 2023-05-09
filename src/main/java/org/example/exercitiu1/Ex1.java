package org.example.exercitiu1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class Ex1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")
                .addAnnotatedClass(Movie.class)
                .addAnnotatedClass(Actor.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Movie movie1 = new Movie();
        movie1.setId(12);
        movie1.setName("The Fast and the Furious");
        movie1.setGen(Genre.ACTION);
        movie1.setIncasari(207283925D);
        movie1.setCurrency("Dollar");
        movie1.setImdbScore(200106);
        movie1.setReleaseDate(Date.valueOf("2001-06-18"));
        session.persist(movie1);

        Movie movie2 = new Movie();
        movie2.setId(2);
        movie2.setName("Resident Evil");
        movie2.setGen(Genre.ACTION);
        movie2.setIncasari(102000000D);
        movie2.setCurrency("Dollar");
        movie2.setImdbScore(201503);
        movie2.setReleaseDate(Date.valueOf("2015-03-15"));
        session.persist(movie2);

        transaction.commit();
        session.close();

        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();

        Actor actor1 = new Actor();
        actor1.setId(1);
        actor1.setFirstName("Vin");
        actor1.setLastName("Diesel");
        actor1.setImdbScore(200106);
        actor1.setBirthDate(Date.valueOf("1967-07-18"));
        session1.persist(actor1);

        Actor actor2 = new Actor();
        actor2.setId(2);
        actor2.setFirstName("Paul");
        actor2.setLastName("Walker");
        actor2.setImdbScore(200106);
        actor2.setBirthDate(Date.valueOf("1973-09-12"));
        session1.persist(actor2);

        Actor actor3 = new Actor();
        actor3.setId(3);
        actor3.setFirstName(" Michelle");
        actor3.setLastName("Rodriguez");
        actor3.setImdbScore(200106);
        actor3.setBirthDate(Date.valueOf("1978-07-12"));
        session1.persist(actor3);

        transaction1.commit();
        session1.close();
    }
}
