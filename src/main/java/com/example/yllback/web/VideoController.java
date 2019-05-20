package com.example.yllback.web;

import com.example.yllback.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VideoController {
    @Autowired
    private VideoService service;

    @RequestMapping(value = "/getAllVideo",method = RequestMethod.GET)
    private List<Object> getAllVideo(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllVideo());
        return list;
    }
}
