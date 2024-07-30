package org.example.controller;

import org.example.dao.RoomMapper;
import org.example.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/30 下午4:52
 */
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomMapper roomMapper;
    @GetMapping("/all")
    public List<Room> QueryAll() throws IOException {
        return roomMapper.selectAllRoom();
    }
    @GetMapping("/tid/{typeid}")
    public List<Room> QueryByTypeId(@PathVariable("typeid") int typeId) throws IOException {
        return roomMapper.selectRoomByTypeId(typeId);
    }
}