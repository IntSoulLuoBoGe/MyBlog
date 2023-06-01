package com.my.blog.controller;

import com.my.blog.domain.ResponseResult;
import com.my.blog.service.IArticleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author WH
 * @since 2023-05-16
 */
@RestController
@RequestMapping("/article")
@Api(value = "文章接口",tags = "文章接口1")
public class ArticleController {
    @Autowired
    private IArticleService articleService;

    @GetMapping("/hotArticleList")
    @ResponseBody
    public ResponseResult hotArticleList(){
        ResponseResult result = articleService.hotArticleList();
        return result;
    }

    @GetMapping("/articleList")
    @ResponseBody
    public ResponseResult articleList(Integer pageNum, Integer pageSize, Long
            categoryId) {
        return articleService.articleList(pageNum, pageSize, categoryId);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseResult getArticleDetail(@PathVariable("id") Long id) {
        return articleService.getArticleDetail(id);
    }


}
