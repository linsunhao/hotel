package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {
    //  房型id
    private Integer id;

    //  房型名称
    private String typeName;

    //  房型价格
    private double price;

    //  剩余数量
    private Integer number;

    //  房型信息
    private String info;
}