package edu.sejong.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.vo.StudentInformation;



@Controller
public class StudentController {
	
	@RequestMapping("/student/view")
	public String view() {
		System.out.println("view()..");
		return "student/student";
	}
	
//	@RequestMapping(method = RequestMethod.GET, value = "/student")
//	public String student(@RequestParam("id") String id, Model model) {
//		System.out.println("student()..");
//		model.addAttribute("studentId", id);
//		return "student/student_id";
//	}
	
	//@RequestMapping(method = RequestMethod.POST, value = "/student")
	@RequestMapping("/student")
	public String student(@RequestParam("id") String id, Model model) {
		System.out.println("student()..");
		model.addAttribute("studentId", id);
		return "student/student_id";
	}
	
//	@PostMapping("/studentView")
//	public String studentView(StudentInformation studentInformation, Model model) {
//		System.out.println("studentView()..");
//		model.addAttribute("studentInformation", studentInformation);
//		return "student/studentview";
//	}

	@PostMapping("/studentView")
	public String studentView(@ModelAttribute("studentInfo") StudentInformation studentInformation) {
		System.out.println("studentView()..");
		return "student/studentview";
	}
}
