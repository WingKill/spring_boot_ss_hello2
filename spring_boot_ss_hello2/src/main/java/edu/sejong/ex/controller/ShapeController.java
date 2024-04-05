package edu.sejong.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.vo.Circle;
import edu.sejong.ex.vo.Rectangle;

@Controller
@RequestMapping("/shape")
public class ShapeController {

//	@GetMapping("/rectangle")
//	public String rectangle() {
//		System.out.println("rectangle()..");
//		
//		return "home";
//	}
	
//	@GetMapping("/circle")
//	public String circle() {
//		System.out.println("circle()..");
//		
//		return "home";
//	}
	
//	@GetMapping("/circle")
//	public String circle(HttpServletRequest request, Model model) {		
//		System.out.println("circle()..");
//		String radius = request.getParameter("radius");
//		System.out.println(radius);
//		
//		model.addAttribute("radius", radius);
//		return "/shape/circle";
//	}
	
//	@GetMapping("/circle")
//	public String circle(@RequestParam("radius") double radius, Model model) {		
//		System.out.println("circle()..");
//		
//		model.addAttribute("radius", radius);
//		return "/shape/circle";
//	}
	
//	@GetMapping("/circle")
//	public String circle(HttpServletRequest request, Circle circle, Model model) {		
//		System.out.println("circle()..");
//		double radius = Double.valueOf(request.getParameter("radius"));
//		System.out.println(radius);
//		model.addAttribute("circle", circle);
//		return "/shape/circle";
//	}
	
//	@RequestMapping("/circle")
//	public String circle(HttpServletRequest request, Circle circle, Model model) {		
//		System.out.println("circle()..");
//		double radius = Double.valueOf(request.getParameter("radius"));
//		System.out.println(radius);
//		model.addAttribute("circle", circle);
//		return "/shape/circle";
//	}
	
//	@RequestMapping("/circle")
//	public String circle(@RequestParam("radius") double radius, Model model) {		
//		System.out.println("circle()..");
//		//String radius = request.getParameter("radius");
//		Circle circle = new Circle(radius);
//		model.addAttribute("circle", circle);
//		return "/shape/circle";
//	}
	
	@RequestMapping("/circle")
	public String circle(Circle circle, Model model) {		
		System.out.println("circle()..");
		model.addAttribute("circle", circle);
		return "/shape/circle";
	}
	
	@RequestMapping("/rectangle")
	public String rectangle(Rectangle rectangle, Model model) {
		System.out.println("rectangle()..");
		model.addAttribute("rectangle", rectangle);
		return "/shape/rectangle";
	}
}
