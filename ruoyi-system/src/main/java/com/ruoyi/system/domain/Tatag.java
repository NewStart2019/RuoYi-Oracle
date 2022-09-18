package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 标签对象 tatag
 *
 * @author ruoyi
 * @date 2022-09-18
 */
public class Tatag extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Long tagid;

    /**
     * 标签名
     */
    @Excel(name = "标签名")
    private String tagname;

    /**
     * 标签组id
     */
    @Excel(name = "标签组id")
    private String taggroupid;

    /**
     * 有效标识
     */
    @Excel(name = "有效标识")
    private String effective;

    /**
     * 创建人
     */
    @Excel(name = "创建人")
    private String createuser;

    /**
     * 销毁标识
     */
    @Excel(name = "销毁标识")
    private String destory;

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public Long getTagid() {
        return tagid;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTaggroupid(String taggroupid) {
        this.taggroupid = taggroupid;
    }

    public String getTaggroupid() {
        return taggroupid;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }

    public String getEffective() {
        return effective;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setDestory(String destory) {
        this.destory = destory;
    }

    public String getDestory() {
        return destory;
    }


    public Date getUpdatetime() {
        return super.getUpdateTime();
    }

    public void setUpdatetime(Date updateTime) {
        super.setUpdateTime(updateTime);
    }

    public Date getCreatetime() {
        return super.getCreateTime();
    }

    public void setCreatetime(Date createTime) {
        super.setCreateTime(createTime);
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("tagid", getTagid())
                .append("tagname", getTagname())
                .append("taggroupid", getTaggroupid())
                .append("createtime", getCreateTime())
                .append("effective", getEffective())
                .append("createuser", getCreateuser())
                .append("destory", getDestory())
                .append("updatetime", getUpdateTime())
                .toString();
    }
}
