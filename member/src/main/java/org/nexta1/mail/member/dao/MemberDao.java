package org.nexta1.mail.member.dao;

import org.nexta1.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
