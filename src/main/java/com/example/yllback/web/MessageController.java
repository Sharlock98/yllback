package com.example.yllback.web;

import com.example.yllback.entity.LeaveMessage;
import com.example.yllback.entity.YllProducts;
import com.example.yllback.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MessageController {
    @Autowired
    private MessageService service;

    @RequestMapping(value = "/getAllMessage",method = RequestMethod.GET)
    private List<Object> getAllMessage(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllMessage());
        return list;
    }
    @RequestMapping(value = "/getMessageById",method = RequestMethod.GET)
    private List<Object> getMessageById(int id){
        List<Object> list=new ArrayList<>();
        list.add(service.getMessageById(id));
        return list;
    }
    @RequestMapping(value = "/addMessage",method = RequestMethod.POST)
    private List<Object> addMessage(@RequestBody LeaveMessage leaveMessage){
        List<Object> list=new ArrayList<>();
        list.add(service.addMessage(leaveMessage));
        return list;
    }
    @RequestMapping(value = "/removeMessage",method = RequestMethod.GET)
    private List<Object> removeMessage(int id){
        List<Object> list=new ArrayList<>();
        list.add(service.deleteMessage(id));
        return list;
    }
}
