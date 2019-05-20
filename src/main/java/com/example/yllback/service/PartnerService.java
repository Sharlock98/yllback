package com.example.yllback.service;

import com.example.yllback.entity.Partner;

import java.util.List;

public interface PartnerService {
    List<Partner> getAllAllPartner();

    boolean deletePartner(int id);

    boolean addPartner(Partner partner);

    boolean motifyPartner(Partner partner);
}
