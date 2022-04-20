package com.jdk.jenkinsdockerkubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/start")
    public String start(){
        return "Just a start to test";
    }
    @GetMapping("/pipeline")
    public String pipeline(){
        return "Just a pipeline demo revised";
    }
    @GetMapping("/demotest")
    public String demotest(){
        return "Just a demo test"
    }
}
