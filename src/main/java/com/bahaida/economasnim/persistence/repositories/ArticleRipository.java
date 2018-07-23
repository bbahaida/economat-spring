package com.bahaida.economasnim.persistence.repositories;

import com.bahaida.economasnim.persistence.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRipository extends JpaRepository<Article, Long> {
}
