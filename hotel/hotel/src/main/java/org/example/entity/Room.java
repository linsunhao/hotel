package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther sun
 * @Time 2024/7/29 下午3:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    //  房间id
    private Integer id;

    //  房间房型id
    private Integer typeId;

    //  房间房号（如701、702）
    private String no;

    //  房间状态（未打扫、已打扫、打扫中、已入住）
    private String status;

    //  负责的管理人员
    private Cleaner cleaners;
}