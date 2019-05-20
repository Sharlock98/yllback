package com.example.yllback.service.impl;

import com.example.yllback.dao.UserDao;
import com.example.yllback.entity.UserInfo;
import com.example.yllback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserInfo> getUserList() {
        return userDao.queryInfo();
    }

    @Override
    public UserInfo getUserById(int id) {
        return userDao.queryInfoById(id);
    }

    @Transactional
    @Override
    public boolean addUser(UserInfo userInfo) {
        //空值判断
        if (userInfo.getUsername() != null && !"".equals(userInfo.getUsername())) {
            try {
                if (userDao.insertInfo(userInfo) > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息为空!");
        }
    }

    @Override
    public boolean modifyUser(UserInfo userInfo) {
        //空值判断
        if (userInfo.getId() != null && userInfo.getId() > 0) {
            try {
                if (userDao.updateInfo(userInfo) > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息为空!");
        }
    }

    @Override
    public boolean deleteUser(int id) {
        if (id > 0) {
            try {
                if (userDao.deleteInfo(id) > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息为空!");
        }
    }
}
