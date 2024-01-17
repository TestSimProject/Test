package org.project.simproject.repository;

import org.project.simproject.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Optional<Bookmark> findByUserId(Long userId);
    List<Bookmark> findByUserIdAndArticleId(Long userId, Long articleId);
}
