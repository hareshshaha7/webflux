package com.haresh.spring.webflux;

import com.haresh.spring.webflux.client.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebfluxApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebfluxApplication.class, args);
		GreetingClient client = context.getBean(GreetingClient.class);
		System.out.println(">> Message >> " + client.getMessage().block());
	}

}
