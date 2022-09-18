package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 标签对象 tatag
 * 
 * @author ruoyi
 * @date 2022-09-18
 */
public class Tatag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签id */
    private String tagid;

    /** 标签名 */
    @Excel(name = "标签名")
    private String tagname;

    /** 标签组id */
    @Excel(name = "标签组id")
    private String taggroupid;

    /** 有效标识 */
    @Excel(name = "有效标识")
    private String effective;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createuser;

    /** 销毁标识 */
    @Excel(name = "销毁标识")
    private String destory;

    public void setTagid(String tagid) 
    {
        this.tagid = tagid;
    }

    public String getTagid() 
    {
        return tagid;
    }
    public void setTagname(String tagname) 
    {
        this.tagname = tagname;
    }

    public String getTagname() 
    {
        return tagname;
    }
    public void setTaggroupid(String taggroupid) 
    {
        this.taggroupid = taggroupid;
    }

    public String getTaggroupid() 
    {
        return taggroupid;
    }
    public void setEffective(String effective) 
    {
        this.effective = effective;
    }

    public String getEffective() 
    {
        return effective;
    }
    public void setCreateuser(String createuser) 
    {
        this.createuser = createuser;
    }

    public String getCreateuser() 
    {
        return createuser;
    }
    public void setDestory(String destory) 
    {
        this.destory = destory;
    }

    public String getDestory() 
    {
        return destory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tagid", getTagid())
            .append("tagname", getTagname())
            .append("taggroupid", getTaggroupid())
            .append("createtime", getCreatetime())
            .append("effective", getEffective())
            .append("createuser", getCreateuser())
            .append("destory", getDestory())
            .append("updatetime", getUpdatetime())
            .toString();
    }
}
