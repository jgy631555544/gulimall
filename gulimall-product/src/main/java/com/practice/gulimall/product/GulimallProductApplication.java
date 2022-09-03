package com.practice.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *  1、导入依赖
 *  2、配置
 *      1、配置数据源
 *          1、导入数据库驱动
 *      2、配置mybatis-plus
 */
@MapperScan("com.practice.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
