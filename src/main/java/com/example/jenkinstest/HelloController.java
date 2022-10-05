package com.example.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    HelloController() {
        String s = "3";
        String st2 = "4";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
