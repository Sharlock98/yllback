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

    @Override
    public List<Administrator> getAllAccount() {
        return dao.selectAllAccount();
    }


    @Override
    public boolean deleteAccount(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean addAccount(Administrator administrator) {
        return dao.insert(administrator)>0;
    }

    @Override
    public boolean modifyAccount(Administrator administrator) {
        return dao.updateByPrimaryKeySelective(administrator)>0;
    }
}
