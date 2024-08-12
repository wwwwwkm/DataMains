package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OrdersArticleUser;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
public interface OrdersArticleUserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OrdersArticleUser selectOrdersArticleUserByOrderId(Long orderId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OrdersArticleUser> selectOrdersArticleUserList(OrdersArticleUser ordersArticleUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 结果
     */
    public int insertOrdersArticleUser(OrdersArticleUser ordersArticleUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 结果
     */
    public int updateOrdersArticleUser(OrdersArticleUser ordersArticleUser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOrdersArticleUserByOrderId(Long orderId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrdersArticleUserByOrderIds(Long[] orderIds);
}
