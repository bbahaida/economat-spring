package com.bahaida.economasnim.persistence.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articles")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","commands"})
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String designation;
    private double prixUnitaire;


    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticleCommand> commands = new ArrayList<>();

    public Article() {
    }

    public Article(String designation, double prixUnitaire) {
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @JsonGetter
    public List<ArticleCommand> getCommands() {
        return commands;
    }

    @JsonSetter
    public void setCommands(List<ArticleCommand> commands) {
        this.commands = commands;
    }
}
