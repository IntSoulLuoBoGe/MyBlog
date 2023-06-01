package com.my.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: QinXS
 * @date: 2023-5-30 15:24
 * @description:
 */
@SpringBootApplication
@MapperScan("com.wh.blog.dao")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);}
}
