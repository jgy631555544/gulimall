package com.practice.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.common.utils.PageUtils;
import com.practice.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-09-03 12:08:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

