package org.example.testproject_25_09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // 복습 하기
    @GetMapping("/a") // http://localhost:8080/a
    @ResponseBody // 화면에 보여주기
    public String a(){
        return "hi";
    }

    @GetMapping("/b") // http://localhost:8080/b
    @ResponseBody // 화면에 보여주기
    public String b(){
        return "hi2";
    }
}
