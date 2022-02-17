package com.helloworld.hello.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.helloworld.hello.HelloApplication;


@SpringBootApplication
@RequestMapping
public class HelloWord {
	
	@GetMapping("/atividade1")
	public String atividade1() {
		return "Hello Word, persistencia e orientacao ao detalhe.";	
	}
	@GetMapping("/atividade2")
	public String atividade2() {
		return "Hello Word, quero aprender sobre os conceitos e funcionalidades do Spring.";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	
}
