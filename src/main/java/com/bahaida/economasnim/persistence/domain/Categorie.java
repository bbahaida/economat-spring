package com.bahaida.economasnim.persistence.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","agents"})
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categorieId;
    @Column(nullable = false, unique = true)
    private String designation;
    @Column(nullable = false)
    private double ceil;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Agent> agents =  new ArrayList<>();

    public Categorie() {
    }

    public Categorie(String designation, double ceil) {
        this.designation = designation;
        this.ceil = ceil;
    }

    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getCeil() {
        return ceil;
    }

    public void setCeil(double ceil) {
        this.ceil = ceil;
    }

    @JsonGetter
    public List<Agent> getAgents() {
        return agents;
    }

    @JsonSetter
    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
}
