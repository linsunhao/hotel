package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    //  订单id
    private Integer id;

    //  客户id
    private Integer customerId;

    //  房间id
    private Integer roomId;

    //  订单状态（已预约、已支付、已入住、已完成）
    private String status;

    //  订单金额
    private double amount;

    //  下单日期
    private LocalDateTime beginTime;

    //  结束日期
    private LocalDateTime endTime;
}