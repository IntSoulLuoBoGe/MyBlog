package com.my.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.blog.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author WH
 * @since 2023-05-16
 */

@Repository
public interface ArticleMapper extends BaseMapper<Article> {

}
