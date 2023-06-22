package com.circuit.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {

    @RequestMapping("/test")
    
    String home() {
        return "This is the message I meant to change on my first commit";
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
