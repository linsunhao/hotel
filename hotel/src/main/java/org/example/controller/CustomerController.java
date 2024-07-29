package org.example.controller;

import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:55
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/login")
    public Result login(@RequestBody Customer customer){
        return customerService.login(customer);
    }
}