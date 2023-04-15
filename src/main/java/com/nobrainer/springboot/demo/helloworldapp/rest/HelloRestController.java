package com.nobrainer.springboot.demo.helloworldapp.rest;

import com.nobrainer.springboot.demo.helloworldapp.HelloWorldApplicationArgs;
import com.nobrainer.springboot.demo.helloworldapp.service.Receptionist;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRestController {


    private final Receptionist simpleReceptionist;
    private final Receptionist timeTalkingReceptionist;
    private final HelloWorldApplicationArgs helloWorldApplicationArgs;

    @Autowired
    public HelloRestController(@Qualifier("simple") Receptionist simpleReceptionist,
                               @Qualifier("time")  Receptionist timeTalkingReceptionist,
                               HelloWorldApplicationArgs helloWorldApplicationArgs
    ){
        this.simpleReceptionist = simpleReceptionist;
        this.timeTalkingReceptionist = timeTalkingReceptionist;
        this.helloWorldApplicationArgs = helloWorldApplicationArgs;
    }

    @GetMapping("/hello/simple")
    public String sayHello(){
        return this.simpleReceptionist.sayHello();
    }

    @GetMapping("/hello/time")
    public String sayHelloWithTime(){
        return this.timeTalkingReceptionist.sayHello();
    }
    @GetMapping("/hello/custom")
    public String sayCustomHello(){
        return "hello "+ this.helloWorldApplicationArgs.getMsg();
    }


    @PostConstruct
    private void postConstruct(){
        System.out.println("HelloRestController.postConstruct"+this.simpleReceptionist);
    }
}
