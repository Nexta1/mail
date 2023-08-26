package org.nexta1.mail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.common.utils.Query;
import org.nexta1.mail.product.dao.AttrGroupDao;
import org.nexta1.mail.product.entity.AttrGroupEntity;
import org.nexta1.mail.product.service.AttrGroupService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("attrGroupService")
@Slf4j
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long Id) {
        if (Id == 0) {
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<>()
            );

            return new PageUtils(page);
        } else {
            String key = (String) params.get("key");
            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id", Id);
            log.info("key{}", key);
            if (!StringUtils.isEmpty(key)) {
                wrapper.and((obj) -> obj.eq("attr_group_id", key)).or().like("attr_group_name", key);
            }
            IPage<AttrGroupEntity> page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    wrapper
            );

            return new PageUtils(page);
        }

    }

}