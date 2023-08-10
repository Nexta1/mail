package org.nexta1.mail.member.feign;

import org.nexta1.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author nexta1
 * @date 2023/8/9 00:15
 */
@FeignClient("coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R memberC();
}
