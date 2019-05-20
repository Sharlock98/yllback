package com.example.yllback.service.impl;

import com.example.yllback.dao.LeaveMessageDao;
import com.example.yllback.entity.LeaveMessage;
import com.example.yllback.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageServicelmpl implements MessageService {
    @Autowired
    private LeaveMessageDao LeaveMessageDao;
    @Override
    public List<LeaveMessage> getAllMessage() {
        return LeaveMessageDao.selectLeaveMessage();
    }

    @Override
    public LeaveMessage getMessageById(int id) {
        return LeaveMessageDao.selectByPrimaryKey(id);
    }
    @Transactional
    @Override
    public boolean addMessage(LeaveMessage leaveMessage) {
        return LeaveMessageDao.insert(leaveMessage) > 0;
    }

    @Override
    public boolean deleteMessage(int id) {
        return LeaveMessageDao.deleteByPrimaryKey(id) > 0;
    }
}
