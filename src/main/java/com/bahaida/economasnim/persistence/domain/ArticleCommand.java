package com.bahaida.economasnim.persistence.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "article_command")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","commande","articleCommandId"})
public class ArticleCommand implements Serializable{


    @EmbeddedId
    private ArticleCommandId articleCommandId;

    //@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("commandId")
    private Commande commande;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("articleId")
    private Article article;


    private int quantite;

    public ArticleCommand() {
    }

    public ArticleCommand(Commande commande, Article article) {
        this.articleCommandId = new ArticleCommandId(commande.getCodeCommande(),article.getCode());
        this.commande = commande;
        this.article = article;
    }

    @JsonGetter
    public ArticleCommandId getArticleCommandId() {
        return articleCommandId;
    }

    @JsonSetter
    public void setArticleCommandId(ArticleCommandId articleCommandId) {
        this.articleCommandId = articleCommandId;
    }

    @JsonGetter
    public Commande getCommande() {
        return commande;
    }

    @JsonSetter
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }



    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;
        ArticleCommand that = (ArticleCommand) obj;
        return Objects.equals(commande, that.commande) && Objects.equals(article, that.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commande,article);
    }

    @Override
    public String toString() {
        return "ArticleCommand{" +
                "commande=" + commande.getCodeCommande() +
                ", article=" + article.getCode() +
                ", quantite=" + quantite +
                '}';
    }
}
