package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Activity;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface IActivityService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Activity selectActivityById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param activity 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Activity> selectActivityList(Activity activity);

    /**
     * 新增【请填写功能名称】
     * 
     * @param activity 【请填写功能名称】
     * @return 结果
     */
    public int insertActivity(Activity activity);

    /**
     * 修改【请填写功能名称】
     * 
     * @param activity 【请填写功能名称】
     * @return 结果
     */
    public int updateActivity(Activity activity);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteActivityByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteActivityById(Long id);
}
