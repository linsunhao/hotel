package org.example.service.impl;

import org.example.dao.CustomerMapper;
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if (login == null) {
            return Result.fail("登陆失败");
        }
        return Result.ok(login);
    }

    @Override
    public Result register(Customer customer) {
        List<Customer> customers = customerMapper.queryCustomerByNickName(customer.getNickName());
        if (customers.size() > 0) {
            return Result.fail("已经有该账号名了，请重新注册");
        }
        Integer register = customerMapper.register(customer);
        if(register == null || register == 0){
            return Result.fail("注册失败，请重试");
        }
        Customer cus = customerMapper.login(customer);
        return Result.ok(cus);
    }
}