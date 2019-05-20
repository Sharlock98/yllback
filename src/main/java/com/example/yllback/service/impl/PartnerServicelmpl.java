package com.example.yllback.service.impl;

import com.example.yllback.dao.PartnerDao;
import com.example.yllback.entity.Partner;
import com.example.yllback.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerServicelmpl implements PartnerService {
    @Autowired
    private PartnerDao dao;

    @Override
    public List<Partner> getAllAllPartner() {
        return dao.selectAllPartner();
    }

    @Override
    public boolean deletePartner(int id) {
        return dao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean addPartner(Partner partner) {
        return dao.insert(partner) > 0;
    }

    @Override
    public boolean motifyPartner(Partner partner) {
        return dao.updateByPrimaryKey(partner) > 0;
    }
}
