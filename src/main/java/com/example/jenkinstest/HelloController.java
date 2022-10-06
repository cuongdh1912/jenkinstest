package com.example.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    HelloController() {
        String s = "3";
        String st2 = "4";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
