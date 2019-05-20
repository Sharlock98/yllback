package com.example.yllback.web;

import com.example.yllback.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PartnerController {
    @Autowired
    private PartnerService service;

    @RequestMapping(value = "/getAllAllPartner",method = RequestMethod.GET)
    private List<Object> getAllAllPartner(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllAllPartner());
        return list;
    }
}
