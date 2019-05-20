package com.example.yllback.dao;

import com.example.yllback.entity.CustomerMessage;

import java.util.List;

public interface CustomerMessageDao {
    List<CustomerMessage> selectAllInformation();

    List<CustomerMessage> selectBychoiceness();

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerMessage record);

    int insertSelective(CustomerMessage record);

    CustomerMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerMessage record);

    int updateByPrimaryKeyWithBLOBs(CustomerMessage record);

    int updateByPrimaryKey(CustomerMessage record);
}