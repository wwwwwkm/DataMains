package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Channel;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-08-11
 */
public interface IChannelService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Channel selectChannelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param channel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Channel> selectChannelList(Channel channel);

    /**
     * 新增【请填写功能名称】
     * 
     * @param channel 【请填写功能名称】
     * @return 结果
     */
    public int insertChannel(Channel channel);

    /**
     * 修改【请填写功能名称】
     * 
     * @param channel 【请填写功能名称】
     * @return 结果
     */
    public int updateChannel(Channel channel);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteChannelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteChannelById(Long id);
}
