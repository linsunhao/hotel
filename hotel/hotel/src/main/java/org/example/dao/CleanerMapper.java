package org.example.dao;

import org.example.entity.Cleaner;

import java.util.List;

public interface CleanerMapper {
    int insert(Cleaner cleaner);
    List<Cleaner> selectAll();
    int deleteByPrimaryKey(int id);
    int update(Cleaner cleaner);
}
