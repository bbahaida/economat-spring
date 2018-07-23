package com.bahaida.economasnim.persistence.domain;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "Commandes")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeCommande;
    private double prixTotal;
    @Temporal(TemporalType.DATE)
    private Date dateCreation = new Date();

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<ArticleCommand> articleCommands;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_id")
    private Agent agent;

    public Commande() {
    }

    public Commande(double prixTotal, Date dateCreation) {
        this.prixTotal = prixTotal;
        this.dateCreation = dateCreation;
    }

    public Long getCodeCommande() {
        return codeCommande;
    }

    public void setCodeCommande(Long codeCommande) {
        this.codeCommande = codeCommande;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Collection<ArticleCommand> getArticleCommands() {
        return articleCommands;
    }

    public void setArticleCommands(Collection<ArticleCommand> articleCommands) {
        this.articleCommands = articleCommands;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
