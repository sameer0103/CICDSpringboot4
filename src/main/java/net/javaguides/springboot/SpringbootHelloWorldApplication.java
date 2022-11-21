package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan 
public class SpringbootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldApplication.class, args);
		System.out.println("test1");
	}

}
