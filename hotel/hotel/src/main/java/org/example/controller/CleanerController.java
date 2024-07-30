package org.example.controller;

import org.example.dao.CleanerMapper;
import org.example.entity.Cleaner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cleaner/")
public class CleanerController {
    @Autowired
    CleanerMapper cleanerMapper;
    @GetMapping("insert")
    public int insert(@RequestBody Cleaner cleaner) {
        int i=cleanerMapper.insert(cleaner);
        return i;
    }
    @GetMapping("all")
    public List<Cleaner> getAll() {
        return cleanerMapper.selectAll();
    }
    @GetMapping("delete/{id}")
    public int delete(@PathVariable("id") int id) {
        int i=cleanerMapper.deleteByPrimaryKey(id);
        return i;
    }
    @GetMapping("update")
    public int update(@RequestBody Cleaner cleaner) {
        int i=cleanerMapper.update(cleaner);
        return i;
    }
}
