package com.my.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.blog.domain.entity.Category;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 分类表 Mapper 接口
 * </p>
 *
 * @author WH
 * @since 2023-05-16
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

}
