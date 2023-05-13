package org.example.database;

import org.example.entity.Car;
import org.example.entity.Driver;
import org.example.entity.Truck;
import org.example.exercitiu1.Actor;
import org.example.exercitiu1.Movie;
import org.example.exercitiu2.Profesor;
import org.example.exercitiu2.Student;
import org.example.relations.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBaseConfig {
    private static SessionFactory sessionFactory= null;
    private DataBaseConfig(){

    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure("hibernate.configuration.xml")
                    .addAnnotatedClass(Car.class)
                    .addAnnotatedClass(Driver.class)
                    .addAnnotatedClass(Truck.class)
                    .addAnnotatedClass(Actor.class)
                    .addAnnotatedClass(Movie.class)
                    .addAnnotatedClass(Profesor.class)
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Child.class)
                    .addAnnotatedClass(Food.class)
                    .addAnnotatedClass(Hobby.class)
                    .addAnnotatedClass(Mother.class)
                    .addAnnotatedClass(Toy.class)
                    .addAnnotatedClass(TvShow.class)
                    .addAnnotatedClass(Animal.class)
                    .buildSessionFactory();

        }
        return sessionFactory;
    }
}
