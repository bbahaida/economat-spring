package com.bahaida.economasnim.persistence.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Agents")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","commandes"})
public class Agent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricule;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int service;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes = new ArrayList<>();


    public Agent() {
    }

    public Agent(String nom, int service) {
        this.nom = nom;
        this.service = service;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @JsonGetter
    public List<Commande> getCommandes() {
        return commandes;
    }

    @JsonSetter
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", service=" + service +
                ", categorie=" + categorie.getDesignation() +
                '}';
    }

}
