package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Picture;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface PictureMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Picture selectPictureById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param picture 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Picture> selectPictureList(Picture picture);

    /**
     * 新增【请填写功能名称】
     * 
     * @param picture 【请填写功能名称】
     * @return 结果
     */
    public int insertPicture(Picture picture);

    /**
     * 修改【请填写功能名称】
     * 
     * @param picture 【请填写功能名称】
     * @return 结果
     */
    public int updatePicture(Picture picture);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePictureById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePictureByIds(Long[] ids);
}
