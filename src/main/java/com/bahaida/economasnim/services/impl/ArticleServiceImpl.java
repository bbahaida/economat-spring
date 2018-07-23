package com.bahaida.economasnim.services.impl;

import com.bahaida.economasnim.persistence.domain.Article;
import com.bahaida.economasnim.persistence.repositories.ArticleRipository;
import com.bahaida.economasnim.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRipository articleRipository;

    public ArticleServiceImpl(ArticleRipository articleRipository) {
        this.articleRipository = articleRipository;
    }

    @Override
    public List<Article> getAll() {
        return articleRipository.findAll();
    }

    @Override
    public Article save(Article article) {
        return null;
    }

    @Override
    public Article getOne(Long id) {
        return null;
    }

    @Override
    public Article update(Long id, Article article) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
