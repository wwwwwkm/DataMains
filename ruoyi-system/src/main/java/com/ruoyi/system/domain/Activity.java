package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 activity
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class Activity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 图文 */
    @Excel(name = "图文")
    private String essay;

    /** 举办人 */
    @Excel(name = "举办人")
    private String organizer;

    /** 举办时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "举办时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date holdTime;

    /** 过期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "过期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expirationTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setEssay(String essay) 
    {
        this.essay = essay;
    }

    public String getEssay() 
    {
        return essay;
    }
    public void setOrganizer(String organizer) 
    {
        this.organizer = organizer;
    }

    public String getOrganizer() 
    {
        return organizer;
    }
    public void setHoldTime(Date holdTime) 
    {
        this.holdTime = holdTime;
    }

    public Date getHoldTime() 
    {
        return holdTime;
    }
    public void setExpirationTime(Date expirationTime) 
    {
        this.expirationTime = expirationTime;
    }

    public Date getExpirationTime() 
    {
        return expirationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("address", getAddress())
            .append("essay", getEssay())
            .append("organizer", getOrganizer())
            .append("holdTime", getHoldTime())
            .append("createTime", getCreateTime())
            .append("expirationTime", getExpirationTime())
            .toString();
    }
}
