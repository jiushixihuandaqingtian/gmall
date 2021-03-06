package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author yhj
 * @email yhj@atguigu.com
 * @date 2020-07-16 21:28:10
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNoticeEntity> {
	
}
