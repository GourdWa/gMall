package com.learn.gulimall.product.dao;

import com.learn.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ZixiangHu
 * @email 1312685188@qq.com
 * @date 2020-07-31 09:59:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
