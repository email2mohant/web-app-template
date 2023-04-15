package com.nobrainer.springboot.demo.helloworldapp.service;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component("time")
public class TimeTalkingReceptionist implements Receptionist
{
    @Override
    public String sayHello() {
        return String.format("Hello, current time is %s", new Date());
    }
}
