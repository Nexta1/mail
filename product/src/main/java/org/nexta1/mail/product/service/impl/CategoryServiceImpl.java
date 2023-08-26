package org.nexta1.mail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.nexta1.common.utils.PageUtils;
import org.nexta1.common.utils.Query;
import org.nexta1.mail.product.dao.CategoryDao;
import org.nexta1.mail.product.entity.CategoryEntity;
import org.nexta1.mail.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //        一级菜单
        return entities.stream()
                .filter(r -> r.getParentCid() == 0)
                .peek(r -> r.setChildren(getChildren(r, entities)))
                .collect(Collectors.toList());

    }

    @Override
    public void removeMenusByIds(List<Long> ids) {

    }

    @Override
    public Long[] findCateLogPage(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> pathByParentPath = findPathByParentPath(catelogId, paths);
        return pathByParentPath.toArray(new Long[0]);
    }

    private List<Long> findPathByParentPath(Long catelogId, List<Long> paths) {
        CategoryEntity categoryEntity = getById(catelogId);
        paths.add(0, categoryEntity.getCatId());
        if (categoryEntity.getParentCid() != 0) {
            findPathByParentPath(categoryEntity.getParentCid(), paths);
        }
        return paths;
    }


    public List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(categoryEntity -> Objects.equals(categoryEntity.getParentCid(), root.getCatId()))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all)))
                .sorted(Comparator.comparingInt(m -> (m.getSort() == null ? 0 : m.getSort())))
                .collect(Collectors.toList());
    }
}