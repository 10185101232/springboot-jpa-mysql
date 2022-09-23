package com.example.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpademo.domain.User;
import com.example.jpademo.dao.UserDao;

import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl implements Userservice{

    @Autowired
    private UserDao dao;

    @Override
    public void save(User use) {
        dao.save(use);
    }

    @Override
    public List<Map<String, Object>> searchAll() {
        return dao.searchAll();
    }

    @Override
    public List<Map<String, Object>> searchId(int id) {
        return dao.searchId(id);
    }
}
