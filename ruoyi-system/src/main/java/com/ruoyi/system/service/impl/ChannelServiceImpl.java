package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ChannelMapper;
import com.ruoyi.system.domain.Channel;
import com.ruoyi.system.service.IChannelService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-11
 */
@Service
public class ChannelServiceImpl implements IChannelService 
{
    @Autowired
    private ChannelMapper channelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Channel selectChannelById(Long id)
    {
        return channelMapper.selectChannelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param channel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Channel> selectChannelList(Channel channel)
    {
        return channelMapper.selectChannelList(channel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param channel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertChannel(Channel channel)
    {
        return channelMapper.insertChannel(channel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param channel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateChannel(Channel channel)
    {
        return channelMapper.updateChannel(channel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteChannelByIds(Long[] ids)
    {
        return channelMapper.deleteChannelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteChannelById(Long id)
    {
        return channelMapper.deleteChannelById(id);
    }
}
