package org.example.dao;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Customer;
import org.example.unit.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:56
 */
@Repository
public interface CustomerMapper {
    /**
     * 客户登陆
     * @param customer  登陆的客户信息，其中有客户账号名与密码
     * @return  登陆成功则返回用户对象
     */
    Customer login(@Param("customer")Customer customer);

    /**
     * 客户注册
     * @param customer  注册的客户信息
     * @return  成功为1，失败为0
     */
    Integer register(@Param("customer")Customer customer);

    /**
     * 通过账号名查询客户
     * @param nickname  用于查询的账号名
     * @return  客户列表
     */
    List<Customer> queryCustomerByNickName(@Param("nickname")String nickname);
}
