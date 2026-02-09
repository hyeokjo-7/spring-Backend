package com.example.springhello.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller      // HTTP 요청을 처리하는 컨트롤러임을 선언
public class HelloController {

    @GetMapping("/hello")// GET /hello 요청 매핑
    @ResponseBody
    public String hello() {
        return "Hello Spring MVC!";
    }
//    요청 처리 실패 ( 두개가 존재 할 경우 컨테이너가 처리 X )
//    @GetMapping("/hello")  // GET /hello 요청 매핑
//    public String hello2() {
//        return "Hello Spring MVC!";
    }