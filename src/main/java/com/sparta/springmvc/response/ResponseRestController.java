package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response/rest")
public class ResponseRestController {

    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Thomas\",\"age\":31}";
    }

    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("John", 11);
    }
}