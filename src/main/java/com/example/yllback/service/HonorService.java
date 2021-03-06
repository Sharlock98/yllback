package com.example.yllback.service;

import com.example.yllback.entity.Honor;

import java.util.List;

public interface HonorService {
    List<Honor> getAllHonor();

    boolean deleteHonorById(int id);

    boolean modifyHonor(Honor honor);

    boolean addHonor(Honor honor);
}
