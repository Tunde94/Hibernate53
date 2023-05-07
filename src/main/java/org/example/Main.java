package org.example;

import org.example.entity.Car;
import org.example.entity.Driver;
import org.example.entity.Truck;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.configuration.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .addAnnotatedClass(Driver.class)
                .buildSessionFactory();
        //deschidem sessiunea
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Car car = new Car();
        car.setId(11);
        car.setName("Test car");
        transaction.commit();


        Car car2 = new Car();
        car2.setId(12);
        car2.setName("Test car2");

        session.persist(car);//un fel de insert(in tabel)
        session.persist(car2);

        transaction.commit();

        //inchidem sessiunea obligatoriu
        session.close();

        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Driver d = new Driver();
        d.setId(1);
        d.setName("Pop Ioan");
        d.setEmail("pop_ioan@gmail.com");
        d.setMaxTravelDistance(1524);
        d.setSecurityKey("1k22q");

        Driver d1 = new Driver();
        d1.setId(2);
        d1.setName("Baciu Vasile");
        d1.setEmail("vasilebaciu12@gmail.com");
        d1.setMaxTravelDistance(1580);
        d1.setSecurityKey("1k244");

        session1.persist(d);
        session1.persist(d1);
        transaction1.commit();


        session1.close();

    }

}
