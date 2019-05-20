package com.example.yllback.dao;

import com.example.yllback.entity.Clientcase;

import java.util.List;

public interface ClientcaseDao {
    List<Clientcase> selectAllCase();

    int deleteByPrimaryKey(Integer id);

    int insert(Clientcase record);

    int insertSelective(Clientcase record);

    Clientcase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clientcase record);

    int updateByPrimaryKeyWithBLOBs(Clientcase record);

    int updateByPrimaryKey(Clientcase record);
}