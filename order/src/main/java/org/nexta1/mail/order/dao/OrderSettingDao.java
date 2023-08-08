package org.nexta1.mail.order.dao;

import org.nexta1.mail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 14:55:20
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
