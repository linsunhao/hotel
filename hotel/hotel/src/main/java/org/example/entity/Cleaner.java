package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cleaner {

    private Integer id;
    private String name;
    private String phone;
}