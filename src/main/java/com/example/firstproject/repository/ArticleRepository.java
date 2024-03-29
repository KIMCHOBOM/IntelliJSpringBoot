package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;

//CrudRepository 패키지 자동 임포트
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {   //CrudRepository<T, ID>
}
