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

    /**
     * 通过房号来设置房间状态
     * @param id    房间id
     * @param status    要设置的状态
     * @return  成功1，失败0
     */
    Integer setRoomByStatus(@Param("id") Integer id, @Param("status")String status);

    /**
     * 通过房间类型与房间状态（可以为空）查询对应的房间列表
     * @param typeId    房间类型id
     * @param status    状态
     * @return  对应的房间列表
     */
    List<Room> getAllRoomByTypeId(@Param("typeId") Integer typeId,@Param("status") String status);
}
