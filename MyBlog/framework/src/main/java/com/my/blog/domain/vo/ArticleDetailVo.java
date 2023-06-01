package com.my.blog.domain.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: QinXS
 * @date: 2023-5-30 15:13
 * @description:
 */

@Data
public class ArticleDetailVo {
    private Long categoryId;
    private String categoryName;
    private String content;
    private LocalDateTime createTime;
    private Long id;
    private String isComment;
    private String title;
    private Long viewCount;
}

