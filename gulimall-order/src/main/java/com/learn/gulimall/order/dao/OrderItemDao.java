package com.learn.gulimall.order.dao;

import com.learn.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ZixiangHu
 * @email 1312685188@qq.com
 * @date 2020-07-31 11:43:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
