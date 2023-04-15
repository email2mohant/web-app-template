package com.nobrainer.springboot.demo.helloworldapp;

import org.kohsuke.args4j.Option;

public class HelloWorldApplicationArgs {
    @Option(name="--msg")
    private String msg = null;

    public String getMsg() {
        return msg;
    }
}
