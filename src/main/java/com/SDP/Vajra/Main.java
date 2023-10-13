package com.SDP.Vajra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.SDP.Vajra"})
public class Main {

	
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
		
	}

}
