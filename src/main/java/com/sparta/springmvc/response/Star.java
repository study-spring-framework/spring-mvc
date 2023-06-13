package com.sparta.springmvc.response;

import lombok.Getter;

@Getter
public class Star {
    String name; // Json의 Key 역할
    int age; // Json의 Value 역할

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}