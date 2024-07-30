package org.example.controller;

import org.example.dao.RoomTypeMapper;
import org.example.entity.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/30 下午4:55
 */
@RestController
@RequestMapping("/roomtype")
public class RoomTypeController {
    @Autowired
    private RoomTypeMapper roomTypeMapper;
    @GetMapping("/query/{id}")
    public List<RoomType> QueryByid(@PathVariable("id")Integer id) throws IOException {
        List<RoomType> roomTypes=roomTypeMapper.queryRoomTypeId(id);
        return roomTypes;
    }
    @GetMapping("/queryName/{name}")
    public List<RoomType> QueryByName(@PathVariable("name")String name) throws IOException {
        List<RoomType> roomTypes=roomTypeMapper.queryRoomTypeName(name);
        return roomTypes;
    }

    @PostMapping("/insert")
    public int insert(@RequestBody RoomType roomType) throws IOException {
        int i=roomTypeMapper.insertRoomType(roomType);
        return i;
    }
    @PostMapping("/delete/{name}")
    public int delete(@PathVariable("name")String name) throws IOException {
        int i=roomTypeMapper.deleteRoomType(name);
        return i;
    }

}