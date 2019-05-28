package com.example.yllback.service.impl;

import com.example.yllback.dao.HonorDao;
import com.example.yllback.entity.Honor;
import com.example.yllback.service.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServicelmpl implements HonorService{
    @Autowired
    private HonorDao dao;

    @Override
    public List<Honor> getAllHonor() {
        return dao.selectAllHonor();
    }

    @Override
    public boolean deleteHonorById(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean modifyHonor(Honor honor) {
        return dao.updateByPrimaryKeySelective(honor)>0;
    }

    @Override
    public boolean addHonor(Honor honor) {
        return dao.insert(honor)>0;
    }
}
