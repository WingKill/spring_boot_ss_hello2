package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.vo.Circle;
import edu.sejong.ex.vo.Rectangle;


@Controller
@RequestMapping("/path")
public class PathController {
	//http://localhost:8282/path?student=10
	//http://localhost:8282/path/student/10
	@RequestMapping("/student/{id}")
	public String student(@PathVariable String id, Model model) {
		System.out.println("student()..");
		model.addAttribute("studentId", id);
		return "student";
	}
	
	@RequestMapping("/circle/{radius}")
	public String circle(@PathVariable String radius, Circle circle, Model model) {
		System.out.println("circle()..");
		model.addAttribute("circle", circle);
		return "shape/circle";
	}
	
	@RequestMapping("/rectangle/{width}/{height}")
	public String rectangle(@PathVariable String width, @PathVariable String height, Rectangle rectangle, Model model) {
		System.out.println("rectangle()..");
		model.addAttribute("rectangle", rectangle);
		return "shape/rectangle";
	}
}
