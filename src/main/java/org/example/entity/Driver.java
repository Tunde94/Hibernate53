package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
Creați un tabel pentru șoferi (drivers)

id - primary key
name - not null
max_traveldistance - integer
email - unic
security_key - string max 30 caractere
 */
@Entity
@Table(name = "Drivers")
public class Driver {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String Name;

    @Column(name = "max travel distance")
    private Integer maxTravelDistance;

    @Column(unique = true)
    private String email;

    @Column(length = 30, unique = true, name = "security key")
    private String securityKey;

    public Driver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getMaxTravelDistance() {
        return maxTravelDistance;
    }

    public void setMaxTravelDistance(Integer maxTravelDistance) {
        this.maxTravelDistance = maxTravelDistance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
}
