package com.example.yllback.dao;

import com.example.yllback.entity.YllProducts;

import java.util.List;

public interface YllProductsDao {
    List<YllProducts> selectAllProducts();

    List<YllProducts> selectByProductsType(String type);

    int deleteByPrimaryKey(Integer id);

    int insert(YllProducts record);

    int insertSelective(YllProducts record);

    YllProducts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YllProducts record);

    int updateByPrimaryKeyWithBLOBs(YllProducts record);

    int updateByPrimaryKey(YllProducts record);
}