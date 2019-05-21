package com.example.yllback.web;

import com.example.yllback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
