package com.ibm.academia.restap.universidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class ApiUniversidadMananaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiUniversidadMananaApplication.class, args);
	
	}

}
