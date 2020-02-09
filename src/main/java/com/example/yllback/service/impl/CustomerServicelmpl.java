package com.example.yllback.service.impl;

import com.example.yllback.dao.CustomerMessageDao;
import com.example.yllback.entity.CustomerMessage;
import com.example.yllback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicelmpl implements CustomerService{
    @Autowired
    private CustomerMessageDao dao;

    @Override
    public List<CustomerMessage> getAllInformation() {
        return dao.selectAllInformation();
    }

    @Override
    public List<CustomerMessage> getCheckInformation() {
        return dao.selectCheckInformation();
    }

    @Override
    public List<CustomerMessage> getInformationBychoiceness() {
        return dao.selectBychoiceness();
    }

    @Override
    public CustomerMessage getInformationById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean addInformation(CustomerMessage customerMessage) {
        return dao.insert(customerMessage)>0;
    }

    @Override
    public boolean motifyInformation(CustomerMessage customerMessage) {
        return dao.updateByPrimaryKeySelective(customerMessage)>0;
    }

    @Override
    public boolean deleteInformation(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }
}
