package org.project.simproject.repository;

import org.project.simproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByAuthorContains(String author);
    List<Article> findByTitleContains(String title);
}
