package org.example.relations;

import org.example.relations.entity.Child;
import org.example.relations.entity.Food;
import org.example.relations.entity.Parent;
import org.example.relations.entity.Toy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
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
        Food food1 = new Food(1,"HotDog",false);
        session.persist(food1);
        Food food2 = new Food(2,"Shake",true);
        session.persist(food2);
        Toy toy1 = new Toy(1,"Train");
        Child child1 = new Child(null,"Johnny", food1,toy1);
        //salveaza si toy1 fara session.persist(toy1), pentru ca am facut cascade, cand am setat ca si foreign key----@OneToOne(cascade = {CascadeType.PERSIST})----
        session.persist(child1);
        System.out.println("Child was saved");

        transaction.commit();

        /*Transaction transaction1 = session.beginTransaction();
        session.remove(child1);
        transaction1.commit();
        System.out.println("Child was removed");
        System.out.println("Check what happened with toy");*/
        session.close();
    }
}
