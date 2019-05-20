package com.example.yllback.service;

import com.example.yllback.entity.YllProducts;

import java.util.List;

public interface ProductService {
    List<YllProducts> getProductsList();
    YllProducts getProductsListList(int id);
    List<YllProducts> getProductsListByType(String type);
    boolean addProduct(YllProducts yllProducts);
    boolean modifyProducts(YllProducts yllProducts);
    boolean deleteProducts(int id);
}
