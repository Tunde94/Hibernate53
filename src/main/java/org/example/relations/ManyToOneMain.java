package org.example.relations;

import org.example.database.DataBaseConfig;
import org.example.relations.entity.Animal;
import org.example.relations.entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ManyToOneMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DataBaseConfig.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        //Owner owner = new Owner(null,"Johny", new ArrayList<>());
        Owner owner1 = new Owner(null,"Samuel",new ArrayList<>());
        //Animal animal = new Animal(null,"Rex","Dog",owner);
        Animal animal1 = new Animal(null,"Findus","Cat",owner1);
        //Animal animal2 = new Animal(null,"Lulu","Dog",owner1);
        //session.persist(animal);
        //session.persist(animal2);
        owner1.addPet(animal1);
        session.persist(animal1);




        transaction.commit();
        session.close();

    }
}
