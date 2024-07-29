package org.example.dao;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Customer;
import org.example.unit.Result;
import org.springframework.stereotype.Repository;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:56
 */
@Repository
public interface CustomerMapper {
    Customer login(@Param("customer")Customer customer);
}
