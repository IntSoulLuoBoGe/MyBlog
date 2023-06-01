package com.my.blog.domain.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: QinXS
 * @date: 2023-5-30 15:09
 * @description:
 */
@Data
public class ArticleListVo {
    private Long id;
    private String title;
    private String summary;
    private String categoryName;
    private String thumbnail;
    private Long viewCount;
    private LocalDateTime createTime;
}

