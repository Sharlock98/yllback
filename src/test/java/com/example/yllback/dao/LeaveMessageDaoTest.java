package com.example.yllback.dao;

import com.example.yllback.entity.LeaveMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveMessageDaoTest {
    @Autowired
    private LeaveMessageDao dao;
    @Test
    public void selectLeaveMessage() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        LeaveMessage leaveMessage=new LeaveMessage();
        leaveMessage.setCustomerName("李铭彦");
        leaveMessage.setCustomerSex("男");
        leaveMessage.setCustomerCity("铜鼓");
        leaveMessage.setCustomerTel("1233333");
        leaveMessage.setMessage("发生的范德萨发科纳克里收到反馈");
        assertEquals(1,dao.insert(leaveMessage));
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}