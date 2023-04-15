package com.nobrainer.springboot.demo.helloworldapp;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {
	private static String[] applicationArgs = new String[]{};

	public static void main(String[] args) {
		applicationArgs = args == null ? applicationArgs : args;
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@Bean
	public HelloWorldApplicationArgs programArguments() throws CmdLineException {

		HelloWorldApplicationArgs helloWorldApplicationArgs = new HelloWorldApplicationArgs();
		CmdLineParser parser = new CmdLineParser(helloWorldApplicationArgs);
		// parse args
		parser.parseArgument(applicationArgs);

		return  helloWorldApplicationArgs;

	}


}
