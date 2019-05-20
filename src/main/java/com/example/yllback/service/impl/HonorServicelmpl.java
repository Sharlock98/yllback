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
}
