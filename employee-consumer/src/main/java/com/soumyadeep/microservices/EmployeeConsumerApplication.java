package com.soumyadeep.microservices;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.soumyadeep.microservices.controller.ConsumerControllerClient;

@SpringBootApplication
@EnableFeignClients
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx=SpringApplication.run(EmployeeConsumerApplication.class, args);
		
		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		
		System.out.println(consumerControllerClient);
		
		consumerControllerClient.getEmployee();
	}
	
	@Bean
	public ConsumerControllerClient consumerControllerClient() {
		
		return new ConsumerControllerClient();
	}

}

