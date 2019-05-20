package com.example.yllback.dao;

import com.example.yllback.entity.Videos;

import java.util.List;

public interface VideosDao {
    List<Videos> selectAllVideo();

    int deleteByPrimaryKey(Integer id);

    int insert(Videos record);

    int insertSelective(Videos record);

    Videos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Videos record);

    int updateByPrimaryKey(Videos record);
}