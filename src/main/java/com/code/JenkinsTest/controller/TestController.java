package com.code.JenkinsTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/hello")
    public String hello(){
        return "Hello this is test";
    }

    @GetMapping("/api/test")
    public String test(){
        return "Hello this is test 2";
    }

}
