package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
	
	@RequestMapping("/add")
	public int add(int a, int b) {
		return (a + b);
	}
	
	@RequestMapping("/sub")
	public int sub(int a, int b) {
		return (a - b);
	}
	
	@RequestMapping("/mul")
	public int mul(int a, int b) {
		return (a * b);
	}
}
