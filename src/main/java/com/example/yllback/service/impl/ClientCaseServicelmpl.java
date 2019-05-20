package com.example.yllback.service.impl;

import com.example.yllback.dao.ClientcaseDao;
import com.example.yllback.entity.Clientcase;
import com.example.yllback.service.ClientCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientCaseServicelmpl implements ClientCaseService{
    @Autowired
    private ClientcaseDao dao;
    @Override
    public List<Clientcase> getAllCase() {
        return dao.selectAllCase();
    }

    @Override
    public Clientcase getCaseById(int id) {
        return dao.selectByPrimaryKey(id);
    }
}
