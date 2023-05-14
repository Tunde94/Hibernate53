package org.example.relations.entity;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "owner_id")
    List<Animal> pets;



    public Owner(Integer id, String name,List<Animal> pets) {
        this.id = id;
        this.name = name;
        this.pets = pets;
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
    public List<Animal> getPets(){
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    public void addPet(Animal newPet) {
        pets.add(newPet);
    }

    public void removePet(Animal pet) {
        pets.remove(pet);
    }
}
