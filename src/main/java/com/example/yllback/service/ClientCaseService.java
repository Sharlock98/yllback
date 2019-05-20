package com.example.yllback.service;

import com.example.yllback.entity.Clientcase;

import java.util.List;

public interface ClientCaseService {
    List<Clientcase> getAllCase();

    Clientcase getCaseById(int id);

}
