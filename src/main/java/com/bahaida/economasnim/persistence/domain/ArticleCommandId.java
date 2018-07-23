package com.bahaida.economasnim.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticleCommandId implements Serializable{
    @Column(name = "command_id")
    private Long commandId;
    @Column(name = "article_id")
    private Long articleId;

    public ArticleCommandId() {
    }

    public ArticleCommandId(Long commandId, Long articleId) {
        this.commandId = commandId;
        this.articleId = articleId;
    }

    public Long getCommandId() {
        return commandId;
    }

    public void setCommandId(Long commandId) {
        this.commandId = commandId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;
        ArticleCommandId that = (ArticleCommandId) obj;
        return Objects.equals(commandId, that.commandId) && Objects.equals(articleId, that.articleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandId,articleId);
    }

}
