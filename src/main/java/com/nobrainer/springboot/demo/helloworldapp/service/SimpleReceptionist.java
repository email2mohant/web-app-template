package com.nobrainer.springboot.demo.helloworldapp.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("simple")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SimpleReceptionist implements Receptionist{
    @Override
    public String sayHello() {
        return "hello, how are you ? ";
    }
}

