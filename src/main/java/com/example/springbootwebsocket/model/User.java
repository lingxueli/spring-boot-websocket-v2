package com.example.springbootwebsocket.model;

public class User {
    private String name;

    public User(){}

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
