package com.example.yllback.web;

import com.example.yllback.service.ClientCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClientCaseController {
    @Autowired
    private ClientCaseService service;

    @RequestMapping(value = "/getAllCase",method = RequestMethod.GET)
    private List<Object> getAllCase(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllCase());
        return list;
    }
    @RequestMapping(value = "/getCaseById",method = RequestMethod.GET)
    private List<Object> getCaseById(int id){
        List<Object> list=new ArrayList<>();
        list.add(service.getCaseById(id));
        return list;
    }
}
