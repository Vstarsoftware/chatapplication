package com.chatapp.chatapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestChatapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChatapplicationApplication::main).with(TestChatapplicationApplication.class).run(args);
	}

}
