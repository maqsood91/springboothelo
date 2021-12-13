package com.maq;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaZuulService2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulService2Application.class, args);
	}
  
	@PostConstruct
	public void test() {
		System.out.println("test s1");
	}
}
