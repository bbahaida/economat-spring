package com.bahaida.economasnim.services.impl;

import com.bahaida.economasnim.persistence.domain.Article;
import com.bahaida.economasnim.persistence.repositories.ArticleRepository;
import com.bahaida.economasnim.services.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRipository) {
        this.articleRepository = articleRipository;
    }

    @Override
    public Page<Article> getAll(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getOne(Long id) {
        return null;
    }

    @Override
    public Article update(Long id, Article article) {
        Article article1 = articleRepository.getOne(id);
        if(!article1.getDesignation().equals(article.getDesignation())){
            article1.setDesignation(article.getDesignation());
        }
        if (article1.getPrixUnitaire() != article.getPrixUnitaire()){
            article1.setPrixUnitaire(article.getPrixUnitaire());
        }
        return articleRepository.save(article1);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
