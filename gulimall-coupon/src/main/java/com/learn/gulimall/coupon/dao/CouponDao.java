package com.learn.gulimall.coupon.dao;

import com.learn.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ZixiangHu
 * @email 1312685188@qq.com
 * @date 2020-07-31 11:24:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
