package com.SDP.Vajra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sdp03Application {

	@GetMapping("/")
	public String welcome() {
		return "<h1>Hello</h1>";
	}
	public static void main(String[] args) {
		
		SpringApplication.run(Sdp03Application.class, args);
		
	}

}
