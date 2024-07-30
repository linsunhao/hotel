package org.example.service.impl;

import org.example.dao.OrderMapper;
import org.example.dao.RoomMapper;
import org.example.entity.Order;
import org.example.entity.Room;
import org.example.service.OrderService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/30 上午10:44
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Result takeOrder(Order order) {
        Integer i = roomMapper.setRoomByStatus(order.getRoomId(), "已预约");
        if(i == null || i == 0){
            return Result.fail("下单失败");
        }

        Integer i2 = orderMapper.takeOrder(order);
        if(i2 == null || i2 == 0){
            return Result.fail("下单失败");
        }
        return Result.ok("下单成功");
    }

    public Result payOrder(Integer id){
        Integer i = orderMapper.payOrder(id);
        if(i == null || i == 0){
            return  Result.fail("支付失败，请稍后重试");
        }
        return Result.ok("支付成功");
    }


}