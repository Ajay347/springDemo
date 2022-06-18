package com.ajay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args){

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String helloWorld(@PathParam(value = "name") String name){
		return "Hello "+name;
	}

}
