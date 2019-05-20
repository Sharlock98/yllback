package com.example.yllback.web;

import com.example.yllback.entity.UserInfo;
import com.example.yllback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    private Map<String, Object> listuser() {
        Map<String, Object> modelMap = new HashMap<>();
        List<UserInfo> list = userService.getUserList();
        modelMap.put("userList", list);
        return modelMap;
    }

    @RequestMapping(value = "/getuserbyid", method = RequestMethod.GET)
    private Map<String, Object> getUserById(int id) {
        Map<String, Object> modelMap = new HashMap<>();
        UserInfo userInfo = userService.getUserById(id);
        modelMap.put("userList", userInfo);
        return modelMap;
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    private Map<String, Object> addUser(@RequestBody UserInfo userInfo) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userService.addUser(userInfo));
        return modelMap;
    }

    @RequestMapping(value = "/modifyuser", method = RequestMethod.POST)
    private Map<String, Object> modifyuser(@RequestBody UserInfo userInfo) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userService.modifyUser(userInfo));
        return modelMap;
    }

    @RequestMapping(value = "/removeuser", method = RequestMethod.GET)
    private Map<String, Object> removeuser(Integer id) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", userService.deleteUser(id));
        return modelMap;
    }
}
