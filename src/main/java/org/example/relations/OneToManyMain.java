package org.example.relations;

import org.example.database.DataBaseConfig;
import org.example.exercitiu1.Genre;
import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class OneToManyMain {
    public static void main(String[] args) {
        /*SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")
                .addAnnotatedClass(Parent.class)
                .addAnnotatedClass(Hobby.class)
                .buildSessionFactory();*/
        Session session = DataBaseConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Hobby hobby1 = new Hobby(null,"Tennis","beginner");
        Hobby hobby2 = new Hobby(null,"Chess","Intermediate");
        session.persist(hobby1);
        session.persist(hobby2);

        TvShow tvShow = new TvShow(null,"Two night stand", Genre.ROMANCE);
        TvShow tvShow1 = new TvShow(null, "Taxi2",Genre.ACTION);
        //nu vrem sa persistam, deoarece operatia de persist este cascadata din Mother


        Mother p1 = new Mother(null,"Paula",Job.ENGINEER, List.of(hobby1,hobby2),List.of(tvShow,tvShow1));
        session.persist(p1);

        transaction.commit();
        session.close();
    }
}
