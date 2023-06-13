package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;
    @GetMapping("/static-hello")
    // static 폴더에 있는 HTML에 접근하기 위한 2가지 방법
    // 1. url를 static-hello를 통해서 들어갈수 있는데 (이건 controller를 한 번 걸쳐서 찾아서 반환)
    // 2. 타임리프를 통해 url를 static-hello가 아닌 hello.html으로 들어갈수 있음
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    // 네트워크 304 -> redirect
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    // templates 폴더에 있는 html 파일이 반환 (타임리프 엔진)
    public String htmlTemplates(){
        return "hello"; // .html 뺴도 인식가능(자동으로 붙어있다고 생각)
    }

    // 동적페이지 만들기
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount); // 식별이 가능한
        return "hello-visit";
    }
}
