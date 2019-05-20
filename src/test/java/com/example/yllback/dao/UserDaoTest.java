package com.example.yllback.dao;

import com.example.yllback.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void queryInfo() {
        List<UserInfo> infoList=userDao.queryInfo();
        assertEquals(6,infoList.size());
    }

    @Test
    public void queryInfoById() {
        UserInfo userInfo=userDao.queryInfoById(1);
        assertEquals("lmy",userInfo.getUsername());
    }

    @Test
    public void insertInfo() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername("GWDR");
        userInfo.setPassword("098765");
        userInfo.setAddress("南京");
        assertEquals(1,userDao.insertInfo(userInfo));
    }

    @Test
    public void updateInfo() {
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername("cxy");
        userInfo.setId(1);
        assertEquals(1,userDao.updateInfo(userInfo));
    }

    @Test
    public void deleteInfo() {
        assertEquals(1,userDao.deleteInfo(6));
    }
}