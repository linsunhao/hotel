package org.example.service;

import org.example.unit.Result;

/**
 * @Auther sun
 * @Time 2024/7/30 下午8:00
 */
public interface RoomService {
    Result getAllRoomByTypeId(Integer typeId, String status);
}
