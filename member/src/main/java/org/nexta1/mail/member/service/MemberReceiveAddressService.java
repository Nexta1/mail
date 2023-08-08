package org.nexta1.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.mail.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-07-30 15:01:45
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

