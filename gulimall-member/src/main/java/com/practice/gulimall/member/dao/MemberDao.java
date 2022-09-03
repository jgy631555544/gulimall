package com.practice.gulimall.member.dao;

import com.practice.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author GuanYuJin
 * @email jgy631555544@163.com
 * @date 2022-09-03 11:53:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
