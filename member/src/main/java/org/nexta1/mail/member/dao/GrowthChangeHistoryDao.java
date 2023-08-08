package org.nexta1.mail.member.dao;

import org.nexta1.mail.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}
