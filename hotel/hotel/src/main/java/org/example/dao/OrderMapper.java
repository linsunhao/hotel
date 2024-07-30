package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Order;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/30 上午9:31
 */
public interface OrderMapper {
    /**
     * 预约下单
     * @param order 前端发来的订单信息，包括下订单的用户、房型id等信息
     * @return  下单是否成功，1为成功，0失败
     */
    Integer takeOrder(@Param("order") Order order);

    /**
     * 支付订单，修改订单状态
     * @param id    对应的订单id
     * @return  成功为1，失败为0
     */
    Integer payOrder(@Param("id") Integer id);

    /**
     * 通过用户id与订单状态（也可以没有）来查询该用户的订单
     * @param id    用户id
     * @param status    订单状态
     * @return  所有对应的订单
     */
    List<Order> getAllOrderById(@Param("id") Integer id,@Param("status") String status);
}
