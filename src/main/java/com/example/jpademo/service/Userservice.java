package com.example.jpademo.service;

import com.example.jpademo.domain.User;

import java.util.List;
import java.util.Map;

public interface Userservice {
    void save(User use);
    List<Map<String, Object>> searchAll();
    public List<Map<String, Object>> searchId(int id);
}
