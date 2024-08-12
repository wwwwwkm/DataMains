package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PictureMapper;
import com.ruoyi.system.domain.Picture;
import com.ruoyi.system.service.IPictureService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class PictureServiceImpl implements IPictureService 
{
    @Autowired
    private PictureMapper pictureMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Picture selectPictureById(Long id)
    {
        return pictureMapper.selectPictureById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param picture 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Picture> selectPictureList(Picture picture)
    {
        return pictureMapper.selectPictureList(picture);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param picture 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPicture(Picture picture)
    {
        return pictureMapper.insertPicture(picture);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param picture 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePicture(Picture picture)
    {
        return pictureMapper.updatePicture(picture);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePictureByIds(Long[] ids)
    {
        return pictureMapper.deletePictureByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePictureById(Long id)
    {
        return pictureMapper.deletePictureById(id);
    }
}
