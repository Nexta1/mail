package org.nexta1.mail.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.nexta1.mail.coupon.entity.CouponEntity;

/**
 * 优惠券信息
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 14:59:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
