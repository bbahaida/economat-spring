package com.bahaida.economasnim.services;

import com.bahaida.economasnim.persistence.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleService {
    Page<Article> getAll(Pageable pageable);
    Article save(Article article);
    Article getOne(Long id);
    Article update(Long id, Article article);
    boolean delete(Long id);
}
