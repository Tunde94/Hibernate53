package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String type;

    @ManyToOne(cascade = {CascadeType.PERSIST})//diferenta e directia- in Mother am folosit anotatia de One to many, in loc, aici am pus Many to One-in loc sa punem in Owner One to Many
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Animal(Integer id, String name, String type, Owner owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.owner = owner;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
