package com.my.blog.domain.vo;

import lombok.Data;

/**
 * @author: QinXS
 * @date: 2023-5-30 13:05
 * @description:
 */
@Data
public class HotArticleVo {
    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}
