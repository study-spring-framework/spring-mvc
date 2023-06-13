package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content Type : text/html
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson(){
        return "{\"name\":\"thomas\", \"age\":31}";
    }

    // Content Type : application/json
    @GetMapping("/json/class")
    @ResponseBody // 빼면 template might not exist 에러발생
    public Star helloClassJson(){
        return new Star("John",11);
    }
}
