package com.example.yllback.web;

import com.example.yllback.entity.Administrator;
import com.example.yllback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdministratorController {
    @Autowired
    private AdministratorService service;

    @RequestMapping(value = "/getAccount",method = RequestMethod.GET)
    private boolean getAccount(String account,String password){
        return service.getAccount(account, password).size() > 0;
    }
    @RequestMapping(value = "/getAllAccount",method = RequestMethod.GET)
    private List<Object> getAllAccount(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllAccount());
        return list;
    }
    @RequestMapping(value = "/deleteAccount",method = RequestMethod.GET)
    private boolean deleteAccount(int id){
        return service.deleteAccount(id);
    }

    @RequestMapping(value = "/addAccount",method = RequestMethod.POST)
    private boolean addAccount(@RequestBody Administrator administrator){
        return service.addAccount(administrator);
    }

    @RequestMapping(value = "/modifyAccount",method = RequestMethod.POST)
    private boolean modifyAccount(@RequestBody Administrator administrator){
        return service.modifyAccount(administrator);
    }
}
