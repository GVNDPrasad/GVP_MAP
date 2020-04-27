package com.gvp.si;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleInitializrAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleInitializrAppApplication.class, args);
		
		System.out.println("Spring Initiliser app");
	}

}
