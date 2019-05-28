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

    @Override
    public boolean deleteCase(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean motifyCase(Clientcase clientcase) {
        return dao.updateByPrimaryKeySelective(clientcase)>0;
    }

    @Override
    public boolean addCase(Clientcase clientcase) {
        return dao.insert(clientcase)>0;
    }
}
