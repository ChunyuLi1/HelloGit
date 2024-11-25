package com.example.hello.POJO;


import lombok.Data;

@Data
public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
