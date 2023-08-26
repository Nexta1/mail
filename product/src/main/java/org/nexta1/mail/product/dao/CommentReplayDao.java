package org.nexta1.mail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.nexta1.mail.product.entity.CommentReplayEntity;

/**
 * 商品评价回复关系
 *
 * @author nexta1
 * @email nexta1zhx@gmail.com
 * @date 2023-08-11 23:04:12
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
