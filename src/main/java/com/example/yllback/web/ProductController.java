package com.example.yllback.web;

import com.example.yllback.entity.YllProducts;
import com.example.yllback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getallproduct",method = RequestMethod.GET)
    private List<Object> getAllProduct(){
        List<Object> list=new ArrayList<>();
        list.add(productService.getProductsList());
        return list;
    }
    @RequestMapping(value = "/getproductbyid",method = RequestMethod.GET)
    private List<Object> getProductById(int id) {
        List<Object> list=new ArrayList<>();
        YllProducts yllProducts=productService.getProductsListList(id);
        list.add(yllProducts);
        return list;
    }
    @RequestMapping(value = "/getProductByType",method = RequestMethod.GET)
    private List<Object> getProductByType(String type) {
        List<Object> list=new ArrayList<>();
        list.add(productService.getProductsListByType(type));
        return list;
    }
}
