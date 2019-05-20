package com.example.yllback.dao;

import com.example.yllback.entity.Consult;

import java.util.List;

public interface ConsultDao {
    List<Consult> selectAllConsult();

    int deleteByPrimaryKey(Integer id);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKeyWithBLOBs(Consult record);

    int updateByPrimaryKey(Consult record);
}