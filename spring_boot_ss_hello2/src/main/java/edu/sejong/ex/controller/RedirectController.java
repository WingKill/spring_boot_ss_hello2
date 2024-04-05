package edu.sejong.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
 * forward와 redirect의 차이
 *
 * jsp/servlet 
 * request.getRequestDispatcher("/").forward(request, response); // forward
 * response.sendRedirect("/"); // redirect
 * 
 * ---
 * 
 * Spring 
 * 
 * "redirect:/" // redirect
 * "forward:/" "/" // forward
 * 
 * */

@Controller
public class RedirectController {
	
	@RequestMapping("/redirect/check")
	public String redirectCheck(@RequestParam("id")String id, Model model) {		
		System.out.println("redirectCheck()..");
		if(id.equals("abcde")) {
			return "redirect:/studentOK";
		}
		model.addAttribute("id", id);
		return "forward:/studentNG";		
	}
	
	@RequestMapping("/studentOK")
	public String studentOK() {
		
		return "/student/studentOK";
	}
	
	@RequestMapping("/studentNG")
	public String studentNG() {
		
		return "/student/studentNG";
	}
	
//	@RequestMapping(method = RequestMethod.GET, value = "/student")
//	public String student(@RequestParam("id") String id, Model model) {
//		System.out.println("student()..");
//		model.addAttribute("studentId", id);
//		return "student/student_id";
//	}
		
//	@PostMapping("/studentView")
//	public String studentView(StudentInformation studentInformation, Model model) {
//		System.out.println("studentView()..");
//		model.addAttribute("studentInformation", studentInformation);
//		return "student/studentview";
//	}

}
