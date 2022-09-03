package com.practice.gulimall.order.dao;

import com.practice.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-09-03 12:08:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
