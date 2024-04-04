package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home() {
		System.out.println("home()..");
		return "home";
	}
	
	@GetMapping("/home1")
	public String home1() {
		System.out.println("home1()..");
		return "home1";
	}
	
	@GetMapping("/go")
	public String go() {
		System.out.println("go()..");
		return "go";
	}
	
	@GetMapping("/go/go2")
	public String go2() {
		System.out.println("go2()..");
		return "go/go2";
	}
}
