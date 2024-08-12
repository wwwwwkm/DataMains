package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 小程序用户对象 miniUser
 * 
 * @author zky
 * @date 2024-08-11
 */
public class miniUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 头像 */
    @Excel(name = "头像")
    private String avatarUrl;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 登录状态（0正常 1停用） */
    @Excel(name = "登录状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 微信使用唯一表示符 */
    @Excel(name = "微信使用唯一表示符")
    private Long openId;

    /** 平台解决不同应用之间身份识别问题引入的机制 */
    @Excel(name = "平台解决不同应用之间身份识别问题引入的机制")
    private Long unionId;

    /** 登录次数 */
    @Excel(name = "登录次数")
    private Long time;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setAvatarUrl(String avatarUrl) 
    {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() 
    {
        return avatarUrl;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setOpenId(Long openId) 
    {
        this.openId = openId;
    }

    public Long getOpenId() 
    {
        return openId;
    }
    public void setUnionId(Long unionId) 
    {
        this.unionId = unionId;
    }

    public Long getUnionId() 
    {
        return unionId;
    }
    public void setTime(Long time) 
    {
        this.time = time;
    }

    public Long getTime() 
    {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("username", getUsername())
            .append("avatarUrl", getAvatarUrl())
            .append("phone", getPhone())
            .append("password", getPassword())
            .append("status", getStatus())
            .append("openId", getOpenId())
            .append("unionId", getUnionId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("time", getTime())
            .toString();
    }
}
