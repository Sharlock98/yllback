package com.example.yllback.service;

import com.example.yllback.entity.CustomerMessage;

import java.util.List;

public interface CustomerService {
    List<CustomerMessage> getAllInformation();

    List<CustomerMessage> getInformationBychoiceness();

    CustomerMessage getInformationById(int id);

    boolean addInformation(CustomerMessage customerMessage);
}
