package com.my.blog.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: QinXS
 * @date: 2023-5-30 13:42
 * @description:
 */
@SpringBootTest(classes = IArticleService.class)
public class ArticleServiceTest {
    @Autowired
    IArticleService iArticleService;

    @Test
    public void testHotArticleList(){
        System.out.println(iArticleService.hotArticleList());
    }

}
