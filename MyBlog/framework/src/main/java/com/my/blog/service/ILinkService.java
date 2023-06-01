package com.my.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.blog.domain.ResponseResult;
import com.my.blog.domain.entity.Link;

/**
 * <p>
 * 友链 服务类
 * </p>
 *
 * @author Lrh
 * @since 2023-05-31
 */
public interface ILinkService extends IService<Link> {
    ResponseResult getAllLink();

}
