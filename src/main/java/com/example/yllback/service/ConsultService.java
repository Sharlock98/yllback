package com.example.yllback.service;

import com.example.yllback.entity.Consult;

import java.util.List;

public interface ConsultService {
    List<Consult> getAllConsult();

    Consult getConsultById(int id);
}
