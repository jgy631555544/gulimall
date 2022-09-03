package com.practice.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.practice.common.utils.PageUtils;
import com.practice.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-09-03 11:53:44
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

