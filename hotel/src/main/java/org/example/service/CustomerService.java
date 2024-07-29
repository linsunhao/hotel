package org.example.service;

import org.example.entity.Customer;
import org.example.unit.Result;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:35
 */
public interface CustomerService {
    Result login(Customer customer);
}