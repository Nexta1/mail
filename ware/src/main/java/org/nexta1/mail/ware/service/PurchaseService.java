package org.nexta1.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 16:26:29
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

