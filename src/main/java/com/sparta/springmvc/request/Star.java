package com.sparta.springmvc.request;

public class Star {
    String name; // Json의 Key 역할
    int age; // Json의 Value 역할

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
