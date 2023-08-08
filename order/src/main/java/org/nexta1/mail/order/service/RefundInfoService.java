package org.nexta1.mail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 14:55:20
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

