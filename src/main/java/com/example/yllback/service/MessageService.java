package com.example.yllback.service;

import com.example.yllback.entity.LeaveMessage;

import java.util.List;

public interface MessageService {
    List<LeaveMessage> getAllMessage();

    LeaveMessage getMessageById(int id);

    boolean addMessage(LeaveMessage leaveMessage);

    boolean deleteMessage(int id);
}
