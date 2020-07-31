package com.learn.gulimall.ware.dao;

import com.learn.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ZixiangHu
 * @email 1312685188@qq.com
 * @date 2020-07-31 11:49:09
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
