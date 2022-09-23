package com.example.jpademo.domain;

public class User {
    private int id;
    private String name;
    public User(int id2, String name2) {
        id = id2;
        this.name = name2;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
}