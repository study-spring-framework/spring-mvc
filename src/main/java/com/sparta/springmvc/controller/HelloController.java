package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!"; // view 네임의 정보를 전달해준다 -> resources/templates으로
    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get(){
        return "GET Method 요청";
    }

    @PostMapping("/api/post")
    @ResponseBody
    public String post(){
        return "Post Method 요청";
    }

    @PutMapping("/api/put")
    @ResponseBody
    public String put(){
        return "Put Method 요청";
    }

    @PutMapping("/api/delete")
    @ResponseBody
    public String delete(){
        return "Delete Method 요청";
    }
}
