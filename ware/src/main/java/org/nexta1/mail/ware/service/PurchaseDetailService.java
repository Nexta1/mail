package org.nexta1.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 16:26:29
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

