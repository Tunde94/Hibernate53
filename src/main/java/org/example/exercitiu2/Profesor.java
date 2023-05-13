package org.example.exercitiu2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;

@Table(name = "profesori")
@Entity
public class Profesor {
    @Id
    private Integer id;
    private String name;

}
