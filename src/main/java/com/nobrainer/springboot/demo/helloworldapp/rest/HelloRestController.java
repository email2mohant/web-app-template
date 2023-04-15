package com.nobrainer.springboot.demo.helloworldapp.rest;

import com.nobrainer.springboot.demo.helloworldapp.service.Receptionist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    private final Receptionist simpleReceptionist;
    private final Receptionist timeTalkingReceptionist;

    @Autowired
    public HelloRestController(@Qualifier("simple") Receptionist simpleReceptionist,
                               @Qualifier("time")  Receptionist timeTalkingReceptionist
    ){
        this.simpleReceptionist = simpleReceptionist;
        this.timeTalkingReceptionist = timeTalkingReceptionist;
    }

    @GetMapping("/hello/simple")
    public String sayHello(){
        return this.simpleReceptionist.sayHello();
    }

    @GetMapping("/hello/time")
    public String sayHelloWithTime(){
        return this.timeTalkingReceptionist.sayHello();
    }


}
