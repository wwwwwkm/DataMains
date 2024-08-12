package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.miniUser;

/**
 * 小程序用户Service接口
 *
 * @author zky
 * @date 2024-08-11
 */
public interface IminiUserService
{
    /**
     * 查询小程序用户
     *
     * @param userId 小程序用户主键
     * @return 小程序用户
     */
    public miniUser selectminiUserByUserId(Long userId);

    /**
     * 查询小程序用户列表
     *
     * @param miniUser 小程序用户
     * @return 小程序用户集合
     */
    public List<miniUser> selectminiUserList(miniUser miniUser);

    /**
     * 新增小程序用户
     *
     * @param miniUser 小程序用户
     * @return 结果
     */
    public int insertminiUser(miniUser miniUser);

    /**
     * 修改小程序用户
     *
     * @param miniUser 小程序用户
     * @return 结果
     */
    public int updateminiUser(miniUser miniUser);

    /**
     * 批量删除小程序用户
     *
     * @param userIds 需要删除的小程序用户主键集合
     * @return 结果
     */
    public int deleteminiUserByUserIds(Long[] userIds);

    /**
     * 删除小程序用户信息
     *
     * @param userId 小程序用户主键
     * @return 结果
     */
    public int deleteminiUserByUserId(Long userId);
}
