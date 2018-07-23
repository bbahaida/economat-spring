package com.bahaida.economasnim.services;

import com.bahaida.economasnim.persistence.domain.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAll();
    Article save(Article article);
    Article getOne(Long id);
    Article update(Long id, Article article);
    boolean delete(Long id);
}
