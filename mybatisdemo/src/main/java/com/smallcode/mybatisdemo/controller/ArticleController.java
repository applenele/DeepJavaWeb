package com.smallcode.mybatisdemo.controller;

import com.smallcode.mybatisdemo.dao.ArticleDao;
import com.smallcode.mybatisdemo.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @PostMapping(value = "/addArticle")
    public String addArticle(String title) {

        Article article = new Article();
        article.setTitle(title);

        articleDao.addArticle(article);

        return "ok";
    }

    @GetMapping(value = "/getArticleList")
    public List<Article> getArticleList() {
        return articleDao.getArticleList();
    }
}
