package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MessageMember;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface MessageMemberMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param messageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MessageMember selectMessageMemberByMessageId(Long messageId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param messageMember 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MessageMember> selectMessageMemberList(MessageMember messageMember);

    /**
     * 新增【请填写功能名称】
     * 
     * @param messageMember 【请填写功能名称】
     * @return 结果
     */
    public int insertMessageMember(MessageMember messageMember);

    /**
     * 修改【请填写功能名称】
     * 
     * @param messageMember 【请填写功能名称】
     * @return 结果
     */
    public int updateMessageMember(MessageMember messageMember);

    /**
     * 删除【请填写功能名称】
     * 
     * @param messageId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMessageMemberByMessageId(Long messageId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param messageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMessageMemberByMessageIds(Long[] messageIds);
}
