package org.example.relations.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "parents")
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Job job;

    @OneToMany//one mother can have many hobbies
    private List<Hobby> hobbies;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<TvShow> tvShows;

    public Mother(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public Mother(Integer id, String name, Job job, List<Hobby> hobbies, List<TvShow> tvShows) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.hobbies = hobbies;
        this.tvShows = tvShows;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public List<TvShow> getTvShows() {
        return tvShows;
    }

    public void setTvShows(List<TvShow> tvShows) {
        this.tvShows = tvShows;
    }
}
