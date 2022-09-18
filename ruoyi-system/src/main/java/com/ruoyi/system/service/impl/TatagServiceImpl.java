package com.ruoyi.system.service.impl;

import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TatagReadMapper;
import com.ruoyi.system.mapper.TatagWriteMapper;
import com.ruoyi.system.domain.Tatag;
import com.ruoyi.system.service.ITatagService;
import com.ruoyi.common.core.text.Convert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 标签Service业务层处理
 *
 * @author ruoyi
 * @date 2022-09-18
 */
@Service
public class TatagServiceImpl implements ITatagService {
    @Resource
    private TatagReadMapper tatagReadMapper;

    @Resource
    private TatagWriteMapper tatagWriteMapper;

    /**
     * 查询标签
     *
     * @param tagid 标签主键
     * @return 标签
     */
    @Override
    public Tatag selectTatagByTagid(String tagid) {
        return tatagReadMapper.selectTatagByTagid(tagid);
    }

    /**
     * 查询标签列表
     *
     * @param tatag 标签
     * @return 标签
     */
    @Override
    public List<Tatag> selectTatagList(Tatag tatag)  {
        return tatagReadMapper.selectTatagList(tatag);
    }

    /**
     * 新增标签
     *
     * @param tatag 标签
     * @return 结果
     */
    @Override
    public int insertTatag(Tatag tatag) {
        tatag.setCreateTime(new Date());
        tatag.setUpdateTime(tatag.getCreateTime());
        return tatagWriteMapper.insertTatag(tatag);
    }

    /**
     * 修改标签
     *
     * @param tatag 标签
     * @return 结果
     */
    @Override
    public int updateTatag(Tatag tatag) {
        return tatagWriteMapper.updateTatag(tatag);
    }

    /**
     * 批量删除标签
     *
     * @param tagids 需要删除的标签主键
     * @return 结果
     */
    @Override
    public int deleteTatagByTagids(String tagids) {
        return tatagWriteMapper.deleteTatagByTagids(Convert.toStrArray(tagids));
    }

    /**
     * 删除标签信息
     *
     * @param tagid 标签主键
     * @return 结果
     */
    @Override
    public int deleteTatagByTagid(String tagid) {
        return tatagWriteMapper.deleteTatagByTagid(tagid);
    }
}
