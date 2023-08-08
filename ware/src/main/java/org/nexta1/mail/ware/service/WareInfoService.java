package org.nexta1.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 16:26:29
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

