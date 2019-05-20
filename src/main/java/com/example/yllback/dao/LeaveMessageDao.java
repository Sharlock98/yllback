package com.example.yllback.dao;

import com.example.yllback.entity.LeaveMessage;

import java.util.List;

public interface LeaveMessageDao {
    List<LeaveMessage> selectLeaveMessage();

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveMessage record);

    int insertSelective(LeaveMessage record);

    LeaveMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveMessage record);

    int updateByPrimaryKeyWithBLOBs(LeaveMessage record);

    int updateByPrimaryKey(LeaveMessage record);
}