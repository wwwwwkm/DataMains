package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.MemberLevel;
import com.ruoyi.system.mapper.MemberLevelMapper;
import com.ruoyi.system.service.IMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class MemberLevelServiceImpl implements IMemberLevelService
{
    @Autowired
    private MemberLevelMapper memberLevelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MemberLevel selectMemberLevelById(Long id)
    {
        return memberLevelMapper.selectMemberLevelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param memberLevel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel)
    {
        return memberLevelMapper.selectMemberLevelList(memberLevel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param memberLevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMemberLevel(MemberLevel memberLevel)
    {
        return memberLevelMapper.insertMemberLevel(memberLevel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param memberLevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMemberLevel(MemberLevel memberLevel)
    {
        return memberLevelMapper.updateMemberLevel(memberLevel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMemberLevelByIds(Long[] ids)
    {
        return memberLevelMapper.deleteMemberLevelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMemberLevelById(Long id)
    {
        return memberLevelMapper.deleteMemberLevelById(id);
    }
}
