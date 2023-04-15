package com.nobrainer.springboot.demo.helloworldapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/")
    public String sayHello(){
        return "hi from the app 14:" + appName;
    }
    @GetMapping("/hello")
    public String sayHello2(){
        return "hi from the app 10:" + appName;
    }
    @GetMapping("/fortune")
    public String fortune(){
        return "you are lucky today:" + appName;
    }
}
