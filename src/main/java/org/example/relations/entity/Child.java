package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    //presupun ca fiecare copil are o singura mancare favorita
    //presupun ca fiecare mancare este favorita unui copil
    @OneToOne

    private Food favoriteFood;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})//daca nu punem CascadeType.Remove- nu sterge si jucaria, daca punem cascade, sterge si din tabelul toy jucaria preferata a copilului sters

    private Toy favoriteToy;


    public Child(Integer id, String name, Food favoriteFood,Toy favoriteToy) {
        this.id = id;
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.favoriteToy = favoriteToy;
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

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Toy getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(Toy favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
