package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Tatag;

/**
 * 标签Service接口
 * 
 * @author ruoyi
 * @date 2022-09-18
 */
public interface ITatagService 
{
    /**
     * 查询标签
     * 
     * @param tagid 标签主键
     * @return 标签
     */
    public Tatag selectTatagByTagid(String tagid);

    /**
     * 查询标签列表
     * 
     * @param tatag 标签
     * @return 标签集合
     */
    public List<Tatag> selectTatagList(Tatag tatag);

    /**
     * 新增标签
     * 
     * @param tatag 标签
     * @return 结果
     */
    public int insertTatag(Tatag tatag);

    /**
     * 修改标签
     * 
     * @param tatag 标签
     * @return 结果
     */
    public int updateTatag(Tatag tatag);

    /**
     * 批量删除标签
     * 
     * @param tagids 需要删除的标签主键集合
     * @return 结果
     */
    public int deleteTatagByTagids(String tagids);

    /**
     * 删除标签信息
     * 
     * @param tagid 标签主键
     * @return 结果
     */
    public int deleteTatagByTagid(String tagid);
}
