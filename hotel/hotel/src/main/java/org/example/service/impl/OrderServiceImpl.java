package org.example.service.impl;

import org.example.dao.OrderMapper;
import org.example.entity.Order;
import org.example.service.OrderService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther sun
 * @Time 2024/7/30 上午10:44
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Result takeOrder(Order order) {
        Integer i = orderMapper.takeOrder(order);
        if(i == null || i == 0){
            return Result.fail("预约失败，请稍后重试");
        }
        return Result.ok("预约成功！");
    }

    public Result payOrder(Integer id){
        Integer i = orderMapper.payOrder(id);
        if(i == null || i == 0){
            return  Result.fail("支付失败，请稍后重试");
        }
        return Result.ok("支付成功");
    }
}