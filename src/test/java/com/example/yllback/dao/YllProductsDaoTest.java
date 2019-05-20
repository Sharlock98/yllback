package com.example.yllback.dao;

import com.example.yllback.entity.YllProducts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YllProductsDaoTest {
    @Autowired
    private YllProductsDao yllProductsDao;

    @Test
    public void selectAllProducts() {
        List<YllProducts> list=yllProductsDao.selectAllProducts();
        assertEquals(1,list.size());
    }

    @Test
    public void deleteByPrimaryKey() {
        YllProducts yllProducts=yllProductsDao.selectByPrimaryKey(1);
        assertEquals("多功能半自动面条机",yllProducts.getName());
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}