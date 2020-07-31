package com.learn.gulimall.member.dao;

import com.learn.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ZixiangHu
 * @email 1312685188@qq.com
 * @date 2020-07-31 11:32:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
