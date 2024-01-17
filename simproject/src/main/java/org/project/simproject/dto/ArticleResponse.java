package org.project.simproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.project.simproject.domain.Article;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ArticleResponse {
    private String title;
    private String content;
    private LocalDateTime creatAt;
    private LocalDateTime updateAt;
    private String author;
    private int likesCount;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
        this.creatAt = article.getCreateTime();
        this.updateAt = article.getUpdateTime();
        this.author = article.getAuthor();
        this.likesCount = article.getLikesCount();
    }
}
