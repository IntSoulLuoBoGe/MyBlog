package com.my.blog.domain.vo;

import lombok.Data;

/**
 * @author: QinXS
 * @date: 2023-5-30 15:18
 * @description:
 */
@Data
public class LinkVo {
    private Long id;
    private String name;
    private String logo;
    private String description;
    private String address;
}
