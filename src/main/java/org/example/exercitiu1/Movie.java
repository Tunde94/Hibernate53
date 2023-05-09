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
    private Genre genre;

    @Column(name = "release date")
    private Date releaseDate;

    @Column(name="imdb score")
    private Integer imdbScore;

    private Double receipts;

    private String currency;

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
        return genre;
    }

    public void setGen(Genre genre) {
        this.genre = genre;
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
        return receipts;
    }

    public void setIncasari(Double receipts) {
        this.receipts = receipts;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
