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
        return "Ryan: This is the message I meant to change on my first commit <br><br> Matthew: Hello World, My name is wha? <br> My name is who? <br> My name is eh <br><br> Roberto: This is a tech excercise. There are many like it but this one is mine <br> <br> Hello World!!!@!! <br> <br> are we back??? <br> <br> Elias: My name is Elias and I like Minecraft";
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
