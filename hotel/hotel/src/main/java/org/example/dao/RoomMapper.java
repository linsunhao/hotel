package org.example.dao;

/**
 * @Auther sun
 * @Time 2024/7/30 下午4:54
 */

import org.apache.ibatis.annotations.Param;
import org.example.entity.Room;

import java.util.List;

public interface RoomMapper {
    public List<Room> selectAllRoom();
    public List<Room> selectRoomByTypeId(int typeId);
}
