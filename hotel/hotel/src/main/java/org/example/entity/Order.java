package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTF+8")
    //  下单日期
    private LocalDateTime beginTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTF+8")
    //  结束日期
    private LocalDateTime endTime;
}