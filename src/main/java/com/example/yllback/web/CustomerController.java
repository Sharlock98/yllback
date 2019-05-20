package com.example.yllback.web;

import com.example.yllback.entity.CustomerMessage;
import com.example.yllback.service.CustomerService;
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
public class CustomerController {
    @Autowired
    private CustomerService service;

    @RequestMapping(value = "/getAllInformation",method = RequestMethod.GET)
    private List<Object> getAllInformation(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllInformation());
        return list;
    }
    @RequestMapping(value = "/getInformationBychoiceness",method = RequestMethod.GET)
    private List<Object> getInformationBychoiceness(){
        List<Object> list=new ArrayList<>();
        list.add(service.getInformationBychoiceness());
        return list;
    }
    @RequestMapping(value = "/getInformationById",method = RequestMethod.GET)
    private List<Object> getInformationById(int id){
        List<Object> list=new ArrayList<>();
        list.add(service.getInformationById(id));
        return list;
    }
    @RequestMapping(value = "/addInformation",method = RequestMethod.POST)
    private List<Object> addInformation(@RequestBody CustomerMessage customerMessage){
        List<Object> list=new ArrayList<>();
        list.add(service.addInformation(customerMessage));
        return list;
    }
}
