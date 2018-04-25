package com.smallcode.mybatisdemo.dao;

import com.smallcode.mybatisdemo.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {

    void addArticle(Article article);

    List getArticleList();
}
