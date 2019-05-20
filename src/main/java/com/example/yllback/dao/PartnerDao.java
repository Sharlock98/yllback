package com.example.yllback.dao;

import com.example.yllback.entity.Partner;

import java.util.List;

public interface PartnerDao {
    List<Partner> selectAllPartner();

    int deleteByPrimaryKey(Integer id);

    int insert(Partner record);

    int insertSelective(Partner record);

    Partner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}