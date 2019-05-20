package com.example.yllback.dao;

import com.example.yllback.entity.Honor;

import java.util.List;

public interface HonorDao {
    List<Honor> selectAllHonor();

    int deleteByPrimaryKey(Integer id);

    int insert(Honor record);

    int insertSelective(Honor record);

    Honor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Honor record);

    int updateByPrimaryKey(Honor record);
}