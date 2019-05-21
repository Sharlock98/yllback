package com.example.yllback.service.impl;

import com.example.yllback.dao.AdministratorDao;
import com.example.yllback.entity.Administrator;
import com.example.yllback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorSreviselmpl implements AdministratorService {
    @Autowired
    private AdministratorDao dao;

    @Override
    public List<Administrator> getAccount(String account,String password) {
        return dao.selectByaccount(account,password);
    }
}
