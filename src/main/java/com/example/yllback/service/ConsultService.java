package com.example.yllback.service;

import com.example.yllback.entity.Consult;

import java.util.List;

public interface ConsultService {
    List<Consult> getAllConsult();

    Consult getConsultById(int id);

    boolean deleteConsult(int id);

    boolean motifyConsult(Consult consult);

    boolean addConsult(Consult Consult);
}
