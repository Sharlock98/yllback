package com.example.yllback.web;

import com.example.yllback.entity.Videos;
import com.example.yllback.service.VideoService;
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
public class VideoController {
    @Autowired
    private VideoService service;

    @RequestMapping(value = "/getAllVideo",method = RequestMethod.GET)
    private List<Object> getAllVideo(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAllVideo());
        return list;
    }
    @RequestMapping(value = "/deleteVideo",method = RequestMethod.GET)
    private boolean deleteVideo(int id){
        return service.deleteVideo(id);
    }
    @RequestMapping(value = "/modifyVideo",method = RequestMethod.POST)
    private boolean modifyVideo(@RequestBody Videos videos){
        return service.modifyVideo(videos);
    }
    @RequestMapping(value = "/addVideo",method = RequestMethod.POST)
    private boolean addVideo(@RequestBody Videos videos){
        return service.addVideo(videos);
    }
}
