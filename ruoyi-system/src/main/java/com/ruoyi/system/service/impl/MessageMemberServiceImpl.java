package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MessageMemberMapper;
import com.ruoyi.system.domain.MessageMember;
import com.ruoyi.system.service.IMessageMemberService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class MessageMemberServiceImpl implements IMessageMemberService 
{
    @Autowired
    private MessageMemberMapper messageMemberMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param messageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MessageMember selectMessageMemberByMessageId(Long messageId)
    {
        return messageMemberMapper.selectMessageMemberByMessageId(messageId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messageMember 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MessageMember> selectMessageMemberList(MessageMember messageMember)
    {
        return messageMemberMapper.selectMessageMemberList(messageMember);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param messageMember 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMessageMember(MessageMember messageMember)
    {
        return messageMemberMapper.insertMessageMember(messageMember);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param messageMember 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMessageMember(MessageMember messageMember)
    {
        return messageMemberMapper.updateMessageMember(messageMember);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param messageIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessageMemberByMessageIds(Long[] messageIds)
    {
        return messageMemberMapper.deleteMessageMemberByMessageIds(messageIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param messageId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMessageMemberByMessageId(Long messageId)
    {
        return messageMemberMapper.deleteMessageMemberByMessageId(messageId);
    }
}
