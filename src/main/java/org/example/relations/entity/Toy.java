package org.example.relations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//informeaza hibernate sa creaza un tabel
@Table(name = "toys")
public class Toy {
    @Id
    private Integer id;
    private String name;

    public Toy(Integer id,String name) {
        this.id = id;
        this.name = name;
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
