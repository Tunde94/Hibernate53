package org.example.relations.entity;

import jakarta.persistence.*;
import org.example.exercitiu1.Genre;

@Entity
@Table(name = "tv_shows")//numele tabelelor nu au voie sa aiba spatii
public class TvShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    public TvShow(Integer id, String name, Genre genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
