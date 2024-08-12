package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrdersArticleUserMapper;
import com.ruoyi.system.domain.OrdersArticleUser;
import com.ruoyi.system.service.IOrdersArticleUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-12
 */
@Service
public class OrdersArticleUserServiceImpl implements IOrdersArticleUserService 
{
    @Autowired
    private OrdersArticleUserMapper ordersArticleUserMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OrdersArticleUser selectOrdersArticleUserByOrderId(Long orderId)
    {
        return ordersArticleUserMapper.selectOrdersArticleUserByOrderId(orderId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OrdersArticleUser> selectOrdersArticleUserList(OrdersArticleUser ordersArticleUser)
    {
        return ordersArticleUserMapper.selectOrdersArticleUserList(ordersArticleUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOrdersArticleUser(OrdersArticleUser ordersArticleUser)
    {
        return ordersArticleUserMapper.insertOrdersArticleUser(ordersArticleUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param ordersArticleUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOrdersArticleUser(OrdersArticleUser ordersArticleUser)
    {
        return ordersArticleUserMapper.updateOrdersArticleUser(ordersArticleUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param orderIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOrdersArticleUserByOrderIds(Long[] orderIds)
    {
        return ordersArticleUserMapper.deleteOrdersArticleUserByOrderIds(orderIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param orderId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOrdersArticleUserByOrderId(Long orderId)
    {
        return ordersArticleUserMapper.deleteOrdersArticleUserByOrderId(orderId);
    }
}
