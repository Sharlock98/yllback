package com.example.yllback.service.impl;

import com.example.yllback.dao.ConsultDao;
import com.example.yllback.entity.Consult;
import com.example.yllback.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultServicelpml implements ConsultService {
    @Autowired
    private ConsultDao dao;

    @Override
    public List<Consult> getAllConsult() {
        return dao.selectAllConsult();
    }

    @Override
    public Consult getConsultById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteConsult(int id) {
        return dao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean motifyConsult(Consult consult) {
        return dao.updateByPrimaryKeySelective(consult) > 0;
    }

    @Override
    public boolean addConsult(Consult consult) {
        return dao.insert(consult) > 0;
    }
}
