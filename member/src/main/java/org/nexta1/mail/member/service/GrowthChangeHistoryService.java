package org.nexta1.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

