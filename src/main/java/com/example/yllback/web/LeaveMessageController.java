package com.example.yllback.web;

import com.example.yllback.entity.LeaveMessage;
import com.example.yllback.service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaveMessageController {
    @Autowired
    private LeaveMessageService service;

    @RequestMapping(value = "/getAllMessage",method = RequestMethod.GET)
    private List<Object> getAllMessage(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllMessage());
        return list;
    }
    @RequestMapping(value = "/modifyMessage",method = RequestMethod.POST)
    private boolean modifyMessage(@RequestBody LeaveMessage leaveMessage){
        return service.modifyMessage(leaveMessage);
    }
    @RequestMapping(value = "/addMessage",method = RequestMethod.POST)
    private boolean addMessage(@RequestBody LeaveMessage leaveMessage){
        return service.addMessage(leaveMessage);
    }
    @RequestMapping(value = "/removeMessage",method = RequestMethod.GET)
    private boolean removeMessage(int id){
        return service.deleteMessage(id);
    }
}
