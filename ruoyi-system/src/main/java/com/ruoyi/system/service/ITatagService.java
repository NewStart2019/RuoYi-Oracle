package com.ruoyi.system.service;

import com.ruoyi.system.domain.Tatag;

import java.util.List;

/**
 * 标签Service接口
 *
 * @author ruoyi
 * @date 2022-09-18
 */
public interface ITatagService {
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
     * 批量删除标签
     *
     * @param tagids 需要删除的标签主键集合
     * @return 结果
     */
    int deleteTatagByTagids(String tagids);

    /**
     * 删除标签信息
     *
     * @param tagid 标签主键
     * @return 结果
     */
    int deleteTatagByTagid(String tagid);
}
