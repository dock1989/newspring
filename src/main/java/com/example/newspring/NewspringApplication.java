package com.example.newspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class NewspringApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewspringApplication.class, args);
		System.out.println("App is started");
	}

}
