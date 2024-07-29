package org.example.service.impl;

import org.example.dao.CustomerMapper;
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:36
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Result login(Customer customer) {
        Customer login = customerMapper.login(customer);
        if(login == null){
            return Result.fail("登陆失败");
        }
        return Result.ok(login);
    }
}