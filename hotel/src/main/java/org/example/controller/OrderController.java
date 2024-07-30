package org.example.controller;

import org.example.entity.Order;
import org.example.service.OrderService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther sun
 * @Time 2024/7/30 上午10:53
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/takeorder")
    public Result takeOrder(@RequestBody Order order){
        Result result = orderService.takeOrder(order);
        return result;
    }

    @PostMapping("/payorder/{id}")
    public Result payOrder(@PathVariable("id") Integer id){
        Result result = orderService.payOrder(id);
        return result;
    }

//    @GetMapping("/getallorder/{id}")

}