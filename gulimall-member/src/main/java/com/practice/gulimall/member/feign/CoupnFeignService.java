package com.practice.gulimall.member.feign;

import com.practice.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CoupnFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();

}