package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TatagMapper;
import com.ruoyi.system.domain.Tatag;
import com.ruoyi.system.service.ITatagService;
import com.ruoyi.common.core.text.Convert;

/**
 * 标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-18
 */
@Service
public class TatagServiceImpl implements ITatagService 
{
    @Autowired
    private TatagMapper tatagMapper;

    /**
     * 查询标签
     * 
     * @param tagid 标签主键
     * @return 标签
     */
    @Override
    public Tatag selectTatagByTagid(String tagid)
    {
        return tatagMapper.selectTatagByTagid(tagid);
    }

    /**
     * 查询标签列表
     * 
     * @param tatag 标签
     * @return 标签
     */
    @Override
    public List<Tatag> selectTatagList(Tatag tatag)
    {
        return tatagMapper.selectTatagList(tatag);
    }

    /**
     * 新增标签
     * 
     * @param tatag 标签
     * @return 结果
     */
    @Override
    public int insertTatag(Tatag tatag)
    {
        return tatagMapper.insertTatag(tatag);
    }

    /**
     * 修改标签
     * 
     * @param tatag 标签
     * @return 结果
     */
    @Override
    public int updateTatag(Tatag tatag)
    {
        return tatagMapper.updateTatag(tatag);
    }

    /**
     * 批量删除标签
     * 
     * @param tagids 需要删除的标签主键
     * @return 结果
     */
    @Override
    public int deleteTatagByTagids(String tagids)
    {
        return tatagMapper.deleteTatagByTagids(Convert.toStrArray(tagids));
    }

    /**
     * 删除标签信息
     * 
     * @param tagid 标签主键
     * @return 结果
     */
    @Override
    public int deleteTatagByTagid(String tagid)
    {
        return tatagMapper.deleteTatagByTagid(tagid);
    }
}
