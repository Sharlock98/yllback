package com.example.yllback.dao;

import com.example.yllback.entity.Administrator;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorDao {
    List<Administrator> selectByaccount(@Param("account") String account,@Param("password") String password);

    int deleteByPrimaryKey(Integer id);

    int insert(Administrator record);
    
    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}