package com.nobrainer.springboot.demo.helloworldapp.service;

import org.springframework.stereotype.Component;

@Component("simple")
public class SimpleReceptionist implements Receptionist{
    @Override
    public String sayHello() {
        return "hello, how are you ? ";
    }
}
