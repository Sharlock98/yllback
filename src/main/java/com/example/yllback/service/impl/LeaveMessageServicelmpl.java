package com.example.yllback.service.impl;

import com.example.yllback.dao.LeaveMessageDao;
import com.example.yllback.entity.LeaveMessage;
import com.example.yllback.service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LeaveMessageServicelmpl implements LeaveMessageService {
    @Autowired
    private LeaveMessageDao leaveMessageDao;
    @Override
    public List<LeaveMessage> getAllMessage() {
        return leaveMessageDao.selectLeaveMessage();
    }

    @Override
    public LeaveMessage getMessageById(int id) {
        return leaveMessageDao.selectByPrimaryKey(id);
    }
    @Transactional
    @Override
    public boolean addMessage(LeaveMessage leaveMessage) {
        return leaveMessageDao.insert(leaveMessage) > 0;
    }

    @Override
    public boolean deleteMessage(int id) {
        return leaveMessageDao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean modifyMessage(LeaveMessage leaveMessage) {
        return leaveMessageDao.updateByPrimaryKeySelective(leaveMessage)>0;
    }
}
