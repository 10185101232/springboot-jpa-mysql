package com.example.jpademo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jpademo.domain.User;

import java.util.List;
import java.util.Map;

//dao层，写对数据库的操作

//交给springboot管理的注解
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User use) {
        jdbcTemplate.update("insert into user (id, name) values(?, ?)", use.getId(), use.getName());
    }

    public List<Map<String, Object>> searchAll() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM USER");
//        for (Map<String, Object> i : list) {
//            System.out.println(i);
//        }
        return list;
    }

    public List<Map<String, Object>> searchId(int id) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM USER WHERE id = ?", id);
        return list;
    }
}
