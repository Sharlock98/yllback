package com.example.yllback.web;

import com.example.yllback.entity.Partner;
import com.example.yllback.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PartnerController {
    @Autowired
    private PartnerService service;

    @RequestMapping(value = "/getAllPartner",method = RequestMethod.GET)
    private List<Object> getAllPartner(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllAllPartner());
        return list;
    }
    @RequestMapping(value = "/deletePartner",method = RequestMethod.GET)
    private boolean deletePartner(int id){
        return service.deletePartner(id);
    }
    @RequestMapping(value = "/addPartner",method = RequestMethod.POST)
    private boolean addPartner(@RequestBody Partner partner){
        return service.addPartner(partner);
    }
    @RequestMapping(value = "/modifyPartner",method = RequestMethod.POST)
    private boolean modifyPartner(@RequestBody Partner partner){
        return service.modifyPartner(partner);
    }
}
