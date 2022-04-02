package com.code.spring.springbootherokudemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@GetMapping("/test")
	public String test() {
		return "login-page.html";
	}
}