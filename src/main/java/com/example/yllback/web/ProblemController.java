package com.example.yllback.web;

import com.example.yllback.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProblemController {
    @Autowired
    private ProblemService service;

    @RequestMapping(value = "/getAllProblem",method = RequestMethod.GET)
    private List<Object> getAllProblem(){
        List<Object> list=new ArrayList<>();
        list.add(service.getAll());
        return list;
    }
}
