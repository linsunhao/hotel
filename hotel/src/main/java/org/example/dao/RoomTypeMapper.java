package org.example.dao;

import org.example.entity.RoomType;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/29 下午9:38
 */
public interface RoomTypeMapper {
    List<RoomType> queryAllRoomType();
}