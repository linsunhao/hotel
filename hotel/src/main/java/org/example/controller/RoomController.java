package org.example.controller;

import org.example.dao.RoomMapper;
import org.example.entity.Room;
import org.example.service.RoomService;
import org.example.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<Room> QueryAll() throws IOException {
        return roomMapper.selectAllRoom();
    }

    @GetMapping("/{typeid}")
    public List<Room> QueryByTypeId(@PathVariable("typeid") int typeId) throws IOException {
        return roomMapper.selectRoomByTypeId(typeId);
    }

    @GetMapping("/typeandstatus")
    public Result getAllRoomByTypeId(@RequestParam("typeId") Integer typeId, @RequestParam("status") String status){
        return roomService.getAllRoomByTypeId(typeId, status);
    }
}