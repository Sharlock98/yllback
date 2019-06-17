package com.example.yllback.service;

import com.example.yllback.entity.LeaveMessage;

import java.util.List;

public interface LeaveMessageService {
    List<LeaveMessage> getAllMessage();

    LeaveMessage getMessageById(int id);

    boolean addMessage(LeaveMessage leaveMessage);

    boolean deleteMessage(int id);

    boolean modifyMessage(LeaveMessage leaveMessage);
}
