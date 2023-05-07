package org.example.exercitiu1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

/*
- id
- first name
- last name
- birth date
- imdb score
 */
@Entity
public class Actor {
    @Id
    private Integer id;

    @Column(name = "firs name")
    private String firstName;

    @Column(name = "last name")
    private String lastName;

    @Column(name = "birth date")
    private Date birthDate;
    @Column(name = "imdb score")
    private Integer imdbScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(Integer imdbScore) {
        this.imdbScore = imdbScore;
    }
}
