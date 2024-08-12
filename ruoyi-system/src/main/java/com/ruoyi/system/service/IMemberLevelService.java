package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MemberLevel;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-08-12
 */
public interface IMemberLevelService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MemberLevel selectMemberLevelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param memberLevel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

    /**
     * 新增【请填写功能名称】
     *
     * @param memberLevel 【请填写功能名称】
     * @return 结果
     */
    public int insertMemberLevel(MemberLevel memberLevel);

    /**
     * 修改【请填写功能名称】
     *
     * @param memberLevel 【请填写功能名称】
     * @return 结果
     */
    public int updateMemberLevel(MemberLevel memberLevel);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteMemberLevelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMemberLevelById(Long id);
}
