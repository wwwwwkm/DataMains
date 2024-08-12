package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.miniUserMapper;
import com.ruoyi.system.domain.miniUser;
import com.ruoyi.system.service.IminiUserService;

/**
 * 小程序用户Service业务层处理
 *
 * @author zky
 * @date 2024-08-11
 */
@Service
public class miniUserServiceImpl implements IminiUserService
{
    @Autowired
    private miniUserMapper miniUserMapper;

    /**
     * 查询小程序用户
     *
     * @param userId 小程序用户主键
     * @return 小程序用户
     */
    @Override
    public miniUser selectminiUserByUserId(Long userId)
    {
        return miniUserMapper.selectminiUserByUserId(userId);
    }

    /**
     * 查询小程序用户列表
     *
     * @param miniUser 小程序用户
     * @return 小程序用户
     */
    @Override
    public List<miniUser> selectminiUserList(miniUser miniUser)
    {
        return miniUserMapper.selectminiUserList(miniUser);
    }

    /**
     * 新增小程序用户
     *
     * @param miniUser 小程序用户
     * @return 结果
     */
    @Override
    public int insertminiUser(miniUser miniUser)
    {
        miniUser.setCreateTime(DateUtils.getNowDate());
        return miniUserMapper.insertminiUser(miniUser);
    }

    /**
     * 修改小程序用户
     *
     * @param miniUser 小程序用户
     * @return 结果
     */
    @Override
    public int updateminiUser(miniUser miniUser)
    {
        miniUser.setUpdateTime(DateUtils.getNowDate());
        return miniUserMapper.updateminiUser(miniUser);
    }

    /**
     * 批量删除小程序用户
     *
     * @param userIds 需要删除的小程序用户主键
     * @return 结果
     */
    @Override
    public int deleteminiUserByUserIds(Long[] userIds)
    {
        return miniUserMapper.deleteminiUserByUserIds(userIds);
    }

    /**
     * 删除小程序用户信息
     *
     * @param userId 小程序用户主键
     * @return 结果
     */
    @Override
    public int deleteminiUserByUserId(Long userId)
    {
        return miniUserMapper.deleteminiUserByUserId(userId);
    }
}
