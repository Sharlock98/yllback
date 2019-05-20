package com.example.yllback.service.impl;

import com.example.yllback.dao.YllProductsDao;
import com.example.yllback.entity.YllProducts;
import com.example.yllback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicelmpl implements ProductService{
    @Autowired
    private YllProductsDao yllProductsDao;
    @Override
    public List<YllProducts> getProductsList() {
        return yllProductsDao.selectAllProducts();
    }

    @Override
    public YllProducts getProductsListList(int id) {
        return yllProductsDao.selectByPrimaryKey(id);
    }

    @Override
    public List<YllProducts> getProductsListByType(String type) {
        return yllProductsDao.selectByProductsType(type);
    }

    @Override
    public boolean addProduct(YllProducts yllProducts) {
        return false;
    }

    @Override
    public boolean modifyProducts(YllProducts yllProducts) {
        return false;
    }

    @Override
    public boolean deleteProducts(int id) {
        return false;
    }
}
