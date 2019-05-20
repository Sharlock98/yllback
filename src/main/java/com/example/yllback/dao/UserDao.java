package com.example.yllback.dao;

import com.example.yllback.entity.UserInfo;

import java.util.List;

public interface UserDao {
    /**
     * 列出区域列表
     *
     * @return List
     */
    List<UserInfo> queryInfo();
    /**
     * 根据Id列出具体区域
     *
     * @return userInfo
     */
    UserInfo queryInfoById(int Id);
    /**
     * 插入区域信息
     *
     * @param userInfo
     * @return
     */
    int insertInfo(UserInfo userInfo);
    /**
     * 更新区域信息
     *
     * @param userInfo
     * @return
     */
    int updateInfo(UserInfo userInfo);
    /**
     * 删除区域信息
     *
     * @param id
     * @return
     */
    int deleteInfo(int id);
}
