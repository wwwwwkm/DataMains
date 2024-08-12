package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 article
 *
 * @author ruoyi
 * @date 2024-08-11
 */
public class Article extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 所属栏目 */
    @Excel(name = "所属栏目")
    private Long cid;

    /** 推荐热门 */
    @Excel(name = "推荐热门")
    private String tag;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 轮播图片集 */
    @Excel(name = "轮播图片集")
    private String pictures;

    /** 简介 */
    @Excel(name = "简介")
    private String summary;

    /** 内容 */
    @Excel(name = "内容")
    private String info;

    /** 链接 */
    @Excel(name = "链接")
    private String link;

    /** 排序 */
    @Excel(name = "排序")
    private String sort;

    /** 付费状态（0没有 1有） */
    @Excel(name = "付费状态", readConverterExp = "0=没有,1=有")
    private Integer ispay;

    /** 原价 */
    @Excel(name = "原价")
    private Long price1;

    /** 折后价 */
    @Excel(name = "折后价")
    private Long price2;

    /** 订阅数 */
    @Excel(name = "订阅数")
    private Long collectionCount;

    /** 订阅数 */
    @Excel(name = "订阅数")
    private Long subscriptionCount;

    /** 分享次数 */
    @Excel(name = "分享次数")
    private Long shareCount;

    /** 下载次数 */
    @Excel(name = "下载次数")
    private Long downloadCount;

    /** 免费等级（0:免费 1:vip
	） */
    @Excel(name = "免费等级", readConverterExp = "0:免费,1:vip")

    private Integer freeLevel;

    /** 文件 */
    @Excel(name = "文件")
    private String file;

    /** 文件类型（1:视频，2:pdf
	, 3:其他） */
    @Excel(name = "文件类型", readConverterExp = "1:视频，2:pdf,3:其他")
    private Integer fileType;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCid(Long cid)
    {
        this.cid = cid;
    }

    public Long getCid()
    {
        return cid;
    }
    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getTag()
    {
        return tag;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setPictures(String pictures)
    {
        this.pictures = pictures;
    }

    public String getPictures()
    {
        return pictures;
    }
    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public String getSummary()
    {
        return summary;
    }
    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getInfo()
    {
        return info;
    }
    public void setLink(String link)
    {
        this.link = link;
    }

    public String getLink()
    {
        return link;
    }
    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public String getSort()
    {
        return sort;
    }
    public void setIspay(Integer ispay)
    {
        this.ispay = ispay;
    }

    public Integer getIspay()
    {
        return ispay;
    }
    public void setPrice1(Long price1)
    {
        this.price1 = price1;
    }

    public Long getPrice1()
    {
        return price1;
    }
    public void setPrice2(Long price2)
    {
        this.price2 = price2;
    }

    public Long getPrice2()
    {
        return price2;
    }
    public void setCollectionCount(Long collectionCount)
    {
        this.collectionCount = collectionCount;
    }

    public Long getCollectionCount()
    {
        return collectionCount;
    }
    public void setSubscriptionCount(Long subscriptionCount)
    {
        this.subscriptionCount = subscriptionCount;
    }

    public Long getSubscriptionCount()
    {
        return subscriptionCount;
    }
    public void setShareCount(Long shareCount)
    {
        this.shareCount = shareCount;
    }

    public Long getShareCount()
    {
        return shareCount;
    }
    public void setDownloadCount(Long downloadCount)
    {
        this.downloadCount = downloadCount;
    }

    public Long getDownloadCount()
    {
        return downloadCount;
    }
    public void setFreeLevel(Integer freeLevel)
    {
        this.freeLevel = freeLevel;
    }

    public Integer getFreeLevel()
    {
        return freeLevel;
    }
    public void setFile(String file)
    {
        this.file = file;
    }

    public String getFile()
    {
        return file;
    }
    public void setFileType(Integer fileType)
    {
        this.fileType = fileType;
    }

    public Integer getFileType()
    {
        return fileType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cid", getCid())
            .append("tag", getTag())
            .append("title", getTitle())
            .append("pictures", getPictures())
            .append("summary", getSummary())
            .append("info", getInfo())
            .append("link", getLink())
            .append("sort", getSort())
            .append("ispay", getIspay())
            .append("price1", getPrice1())
            .append("price2", getPrice2())
            .append("collectionCount", getCollectionCount())
            .append("subscriptionCount", getSubscriptionCount())
            .append("shareCount", getShareCount())
            .append("downloadCount", getDownloadCount())
            .append("freeLevel", getFreeLevel())
            .append("file", getFile())
            .append("fileType", getFileType())
            .toString();
    }
}
