package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "parents")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Job job;

    public Parent(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
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
}
