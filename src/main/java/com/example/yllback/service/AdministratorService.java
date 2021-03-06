package com.example.yllback.service;

import com.example.yllback.entity.Administrator;

import java.util.List;

public interface AdministratorService {
    List<Administrator> getAccount(String account,String password);

    List<Administrator> getAllAccount();

    boolean deleteAccount(int id);

    boolean addAccount(Administrator administrator);

    boolean modifyAccount(Administrator administrator);
}
