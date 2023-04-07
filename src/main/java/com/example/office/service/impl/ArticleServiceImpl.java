package com.example.office.service.impl;

import com.example.office.model.Article;
import com.example.office.repository.ArticleRepository;
import com.example.office.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }
}
