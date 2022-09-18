package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Tatag;

/**
 * 标签Mapper接口
 *
 * @author ruoyi
 * @date 2022-09-18
 */
public interface TatagMapper
{
    /**
     * 查询标签
     *
     * @param tagid 标签主键
     * @return 标签
     */
    Tatag selectTatagByTagid(String tagid);

    /**
     * 查询标签列表
     *
     * @param tatag 标签
     * @return 标签集合
     */
    List<Tatag> selectTatagList(Tatag tatag);

}
