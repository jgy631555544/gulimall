package com.practice.gulimall.product.dao;

import com.practice.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-08-29 23:09:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
