package org.example.testproject_25_09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // 복습 하기
    @GetMapping("/a") // http://localhost:8080/a?age=20&id=1
    @ResponseBody
    // String으로 통신
    public String hi(String age, String id) {
        return "안녕? %s번, %s살 이야".formatted(id, age);
    }

    @GetMapping("/b") // http://localhost:8080/b?a=10&b=20
    @ResponseBody
    // RequestParam => 파라미터 이름으로 바인딩한다
    // http://localhost:8080/b?a=10 이면 a=10이 바인딩됨
    public String plus(@RequestParam("a") String num1Str, String b) {

        // String을 int로 변환
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(b);

        System.out.println("a : " + num1);
        System.out.println("b : " + num2);

        return "a + b = %d".formatted(num1 + num2);
    }
}
