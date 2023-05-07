package org.example.exercitiu1;

import jakarta.persistence.*;

import java.sql.Date;

/*
- id
- numele
- genul
- release date
- imdb score
- incasari
 */

@Entity
public class Movie {

    @Id
    private Integer id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre gen;

    @Column(name = "release date")
    private Date releaseDate;

    @Column(name="imdb score")
    private Integer imdbScore;

    private Double incasari;

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

    public Genre getGen() {
        return gen;
    }

    public void setGen(Genre gen) {
        this.gen = gen;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(Integer imdbScore) {
        this.imdbScore = imdbScore;
    }

    public Double getIncasari() {
        return incasari;
    }

    public void setIncasari(Double incasari) {
        this.incasari = incasari;
    }
}
