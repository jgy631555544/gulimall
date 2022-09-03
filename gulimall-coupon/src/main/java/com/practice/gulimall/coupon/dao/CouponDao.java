package com.practice.gulimall.coupon.dao;

import com.practice.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-09-03 11:40:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
