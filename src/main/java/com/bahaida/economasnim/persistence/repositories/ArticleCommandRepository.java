package com.bahaida.economasnim.persistence.repositories;

import com.bahaida.economasnim.persistence.domain.ArticleCommand;
import com.bahaida.economasnim.persistence.domain.ArticleCommandId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommandRepository extends JpaRepository<ArticleCommand, ArticleCommandId> {
}
