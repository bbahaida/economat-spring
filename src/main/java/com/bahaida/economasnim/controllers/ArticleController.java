package com.bahaida.economasnim.controllers;

import com.bahaida.economasnim.persistence.domain.Article;
import com.bahaida.economasnim.services.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/articles")
public class ArticleController {
    private ArticleService articleService;

    private Logger logger = LoggerFactory.getLogger(ArticleController.class);

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public Page<Article> getAll(Pageable pageable){
        return articleService.getAll(pageable);
    }

    @PostMapping
    public Article save(@RequestBody Article article){
        logger.info(article.toString());
        return articleService.save(article);
    }

    @PutMapping("/{id}")
    public Article update(@PathVariable("id") Long id, @RequestBody Article article){
        logger.info(article.toString());
        return articleService.update(id,article);
    }
}
