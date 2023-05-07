package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity//creaza tabel cu .addAnnotatedClass(Classname.class)
public class Car {
    @Id//primary key
    private Integer id;
    private  String name;

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
