package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 message
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class Message extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 所属会员 */
    @Excel(name = "所属会员")
    private Long memberId;

    /** 发布人 */
    @Excel(name = "发布人")
    private String publisher;

    /** 消息类型 1:系统通知,2:活动通知,3:普通消息 */
    @Excel(name = "消息类型 1:系统通知,2:活动通知,3:普通消息")
    private Integer messageType;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 0:未读,1:已读 */
    @Excel(name = "0:未读,1:已读")
    private Integer isRead;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdTime;

    /** 是否删除 0:否 1:是 */
    @Excel(name = "是否删除 0:否 1:是")
    private Integer isDeleted;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMemberId(Long memberId) 
    {
        this.memberId = memberId;
    }

    public Long getMemberId() 
    {
        return memberId;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }
    public void setMessageType(Integer messageType) 
    {
        this.messageType = messageType;
    }

    public Integer getMessageType() 
    {
        return messageType;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setIsRead(Integer isRead) 
    {
        this.isRead = isRead;
    }

    public Integer getIsRead() 
    {
        return isRead;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setIsDeleted(Integer isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDeleted() 
    {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memberId", getMemberId())
            .append("publisher", getPublisher())
            .append("messageType", getMessageType())
            .append("content", getContent())
            .append("isRead", getIsRead())
            .append("createdTime", getCreatedTime())
            .append("isDeleted", getIsDeleted())
            .toString();
    }
}
