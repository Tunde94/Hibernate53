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
        movie1.setName("Pettson and Findus");
        movie1.setGen(Genre.ANIMATION);
        movie1.setIncasari(10200D);
        movie1.setImdbScore(12587);
        movie1.setReleaseDate(Date.valueOf("2000-01-02"));
        session.persist(movie1);

        Movie movie2 = new Movie();
        movie2.setId(2);
        movie2.setName("Guess how much I love you");
        movie2.setGen(Genre.ANIMATION);
        movie2.setIncasari(13250D);
        movie2.setImdbScore(12784);
        movie2.setReleaseDate(Date.valueOf("2010-12-24"));
        session.persist(movie2);

        transaction.commit();
        session.close();

        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();

        Actor actor1 = new Actor();
        actor1.setId(1);
        actor1.setFirstName("Sam");
        actor1.setLastName("Mc Bratney");
        actor1.setImdbScore(12784);
        actor1.setBirthDate(Date.valueOf("1943-03-14"));
        session1.persist(actor1);

        Actor actor2 = new Actor();
        actor2.setId(2);
        actor2.setFirstName("Sven");
        actor2.setLastName("Nordqvist");
        actor2.setImdbScore(12587);
        actor2.setBirthDate(Date.valueOf("1946-04-30"));
        session1.persist(actor2);

        transaction1.commit();
        session1.close();
    }
}
