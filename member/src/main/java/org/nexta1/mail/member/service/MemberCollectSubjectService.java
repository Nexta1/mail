package org.nexta1.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

