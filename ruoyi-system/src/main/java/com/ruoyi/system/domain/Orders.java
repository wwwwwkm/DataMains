package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 orders
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public class Orders extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 文章id */
    @Excel(name = "文章id")
    private Long artID;

    /** 购买用户id */
    @Excel(name = "购买用户id")
    private Long userID;

    /** 订单生成日期 */
    @Excel(name = "订单生成日期")
    private String date;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paytype;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal price;

    /** 实付款 */
    @Excel(name = "实付款")
    private BigDecimal fpay;

    /** 是否支付成功 */
    @Excel(name = "是否支付成功")
    private Integer ispay;

    /** 退款状态 */
    @Excel(name = "退款状态")
    private String refundStatus;

    /** 退款金额 */
    @Excel(name = "退款金额")
    private BigDecimal refundAmount;

    /** 支付状态 0:未支付，1:已支付 */
    @Excel(name = "支付状态 0:未支付，1:已支付")
    private Integer payStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setArtID(Long artID) 
    {
        this.artID = artID;
    }

    public Long getArtID() 
    {
        return artID;
    }
    public void setUserID(Long userID) 
    {
        this.userID = userID;
    }

    public Long getUserID() 
    {
        return userID;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate() 
    {
        return date;
    }
    public void setPaytype(String paytype) 
    {
        this.paytype = paytype;
    }

    public String getPaytype() 
    {
        return paytype;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setFpay(BigDecimal fpay) 
    {
        this.fpay = fpay;
    }

    public BigDecimal getFpay() 
    {
        return fpay;
    }
    public void setIspay(Integer ispay) 
    {
        this.ispay = ispay;
    }

    public Integer getIspay() 
    {
        return ispay;
    }
    public void setRefundStatus(String refundStatus) 
    {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatus() 
    {
        return refundStatus;
    }
    public void setRefundAmount(BigDecimal refundAmount) 
    {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundAmount() 
    {
        return refundAmount;
    }
    public void setPayStatus(Integer payStatus) 
    {
        this.payStatus = payStatus;
    }

    public Integer getPayStatus() 
    {
        return payStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("artID", getArtID())
            .append("userID", getUserID())
            .append("date", getDate())
            .append("paytype", getPaytype())
            .append("price", getPrice())
            .append("fpay", getFpay())
            .append("ispay", getIspay())
            .append("refundStatus", getRefundStatus())
            .append("refundAmount", getRefundAmount())
            .append("payStatus", getPayStatus())
            .toString();
    }
}
