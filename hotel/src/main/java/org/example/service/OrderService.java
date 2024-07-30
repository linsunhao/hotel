package org.example.service;

import org.example.entity.Order;
import org.example.unit.Result;

/**
 * @Auther sun
 * @Time 2024/7/30 上午10:43
 */
public interface OrderService {
    Result takeOrder(Order order);
    Result payOrder(Integer id);
}
