package com.example.yllback.web;

import com.example.yllback.entity.Honor;
import com.example.yllback.service.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HonorController {
    @Autowired
    private HonorService service;

    @RequestMapping(value = "/getAllHonor",method = RequestMethod.GET)
    private List<Object> getAllHonor(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllHonor());
        return list;
    }
    @RequestMapping(value = "/deleteHonorById",method = RequestMethod.GET)
    private boolean deleteHonorById(int id){
        return service.deleteHonorById(id);
    }
    @RequestMapping(value = "/modifyHonor",method = RequestMethod.POST)
    private boolean modifyHonor(@RequestBody Honor honor){
        return service.modifyHonor(honor);
    }
    @RequestMapping(value = "/addHonor",method = RequestMethod.POST)
    private boolean addHonor(@RequestBody Honor honor){
        return service.addHonor(honor);
    }
}
