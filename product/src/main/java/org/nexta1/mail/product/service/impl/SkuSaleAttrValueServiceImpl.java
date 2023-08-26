package org.nexta1.mail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.common.utils.Query;
import org.nexta1.mail.product.dao.SkuSaleAttrValueDao;
import org.nexta1.mail.product.entity.SkuSaleAttrValueEntity;
import org.nexta1.mail.product.service.SkuSaleAttrValueService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuSaleAttrValueEntity> page = this.page(
                new Query<SkuSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<SkuSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}