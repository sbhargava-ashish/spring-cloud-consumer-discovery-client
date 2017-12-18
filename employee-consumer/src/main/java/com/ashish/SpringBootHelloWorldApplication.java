package com.ashish;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import com.ashish.controllers.ConsumerControllerClient;

@SpringBootApplication
@Component
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);
		
		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}
