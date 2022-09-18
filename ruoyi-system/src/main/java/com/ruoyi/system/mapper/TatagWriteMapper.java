package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Tatag;

/**
 * 标签Mapper接口
 *
 * @author ruoyi
 * @date 2022-09-18
 */
public interface TatagWriteMapper
{
    /**
     * 新增标签
     *
     * @param tatag 标签
     * @return 结果
     */
    int insertTatag(Tatag tatag);

    /**
     * 修改标签
     *
     * @param tatag 标签
     * @return 结果
     */
    int updateTatag(Tatag tatag);

    /**
     * 删除标签
     *
     * @param tagid 标签主键
     * @return 结果
     */
    int deleteTatagByTagid(String tagid);

    /**
     * 批量删除标签
     *
     * @param tagids 需要删除的数据主键集合
     * @return 结果
     */
    int deleteTatagByTagids(String[] tagids);
}
