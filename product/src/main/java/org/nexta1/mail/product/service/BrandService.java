package org.nexta1.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-08-11 23:04:12
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

