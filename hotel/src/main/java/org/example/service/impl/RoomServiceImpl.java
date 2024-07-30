package org.example.service.impl;

import org.example.dao.RoomMapper;
import org.example.entity.Room;
import org.example.service.RoomService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/30 下午8:01
 */
@Service
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Result getAllRoomByTypeId(Integer typeId, String status) {
        List<Room> allRoomByTypeId = roomMapper.getAllRoomByTypeId(typeId, status);
        if(allRoomByTypeId.size() <= 0){
            return Result.fail("无查询结果");
        }
        return Result.ok(allRoomByTypeId);
    }
}