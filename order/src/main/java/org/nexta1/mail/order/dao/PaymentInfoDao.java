package org.nexta1.mail.order.dao;

import org.nexta1.mail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 14:55:20
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
