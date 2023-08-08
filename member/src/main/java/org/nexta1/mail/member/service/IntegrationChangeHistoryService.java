package org.nexta1.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

