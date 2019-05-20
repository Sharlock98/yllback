package com.example.yllback.service;

import com.example.yllback.entity.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 获取区域列表
     *
     * @return List
     */
    List<UserInfo> getUserList();

    /**
     * 根据区域Id获取区域信息
     *
     * @return userInfo
     */
    UserInfo getUserById(int id);

    /**
     * 增加区域信息
     *
     * @param userInfo
     * @return
     */
    boolean addUser(UserInfo userInfo);

    /**
     * 修改区域信息
     *
     * @param userInfo
     * @return
     */
    boolean modifyUser(UserInfo userInfo);

    /**
     * 删除区域信息
     *
     * @param id
     * @return
     */
    boolean deleteUser(int id);
}
