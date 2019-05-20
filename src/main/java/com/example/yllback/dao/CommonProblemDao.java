package com.example.yllback.dao;

import com.example.yllback.entity.CommonProblem;

import java.util.List;

public interface CommonProblemDao {
    List<CommonProblem> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(CommonProblem record);

    int insertSelective(CommonProblem record);

    CommonProblem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonProblem record);

    int updateByPrimaryKey(CommonProblem record);
}