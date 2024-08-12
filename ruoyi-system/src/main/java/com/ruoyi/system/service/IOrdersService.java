package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Orders;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface IOrdersService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Orders selectOrdersById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param orders 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Orders> selectOrdersList(Orders orders);

    /**
     * 新增【请填写功能名称】
     * 
     * @param orders 【请填写功能名称】
     * @return 结果
     */
    public int insertOrders(Orders orders);

    /**
     * 修改【请填写功能名称】
     * 
     * @param orders 【请填写功能名称】
     * @return 结果
     */
    public int updateOrders(Orders orders);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOrdersByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOrdersById(Long id);
}
