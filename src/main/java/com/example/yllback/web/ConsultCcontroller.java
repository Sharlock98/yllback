package com.example.yllback.web;

import com.example.yllback.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ConsultCcontroller {
    @Autowired
    private ConsultService service;

    @RequestMapping(value = "/getAllConsult",method = RequestMethod.GET)
    private List<Object> getAllConsult(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllConsult());
        return list;
    }
    @RequestMapping(value = "/getConsultById",method = RequestMethod.GET)
    private List<Object> getConsultById(int id){
        List<Object> list=new ArrayList<>();
        list.add(service.getConsultById(id));
        return list;
    }
    }
