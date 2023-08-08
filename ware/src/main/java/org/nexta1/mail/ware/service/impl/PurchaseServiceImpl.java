package org.nexta1.mail.ware.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.common.utils.Query;

import org.nexta1.mail.ware.dao.PurchaseDao;
import org.nexta1.mail.ware.entity.PurchaseEntity;
import org.nexta1.mail.ware.service.PurchaseService;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseEntity> page = this.page(
                new Query<PurchaseEntity>().getPage(params),
                new QueryWrapper<PurchaseEntity>()
        );

        return new PageUtils(page);
    }

}