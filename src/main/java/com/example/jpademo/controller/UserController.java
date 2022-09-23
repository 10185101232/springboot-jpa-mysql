package com.example.jpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.domain.User;
import com.example.jpademo.service.UserserviceImpl;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserserviceImpl userservice;

    @RequestMapping("/insert")
    public String insert(int id, String name) {
//        key得是name，value是插入的名字
        User use = new User(id, name);
        userservice.save(use);
        return "save successfully!";
    }

    @RequestMapping("/searchAll")
    public List<Map<String, Object>> searchAll() {
        return userservice.searchAll();
    }

    @RequestMapping("/searchId")
    public List<Map<String, Object>> searchId(int id) {
        return userservice.searchId(id);
    }
}
