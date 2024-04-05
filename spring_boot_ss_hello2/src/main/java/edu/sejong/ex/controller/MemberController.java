package edu.sejong.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.sejong.ex.vo.MemberVo;


@Controller
@RequestMapping("/member")
public class MemberController {
	// http://localhost:8282/member/view
	@GetMapping("/view")
	public String view() {
		System.out.println("view()..");
		
		return "member/register";
	}
	
//	@RequestMapping("/register")
//	public String register( @RequestParam("id")String id,
//							@RequestParam("pw")String pw,
//							@RequestParam("name")String name,
//							@RequestParam("email")String email,
//							@RequestParam("age")int age,
//							Model model) {
//		System.out.println("register()..");
//		MemberVo memberVo = new MemberVo(name, id, pw, email, age);
//		model.addAttribute("member", memberVo);
//		return "member/register";
//	}
	
	@RequestMapping("/register")
	public String register(MemberVo memberVo, Model model) {
		System.out.println("register()..");
		model.addAttribute("member", memberVo);
		return "member/register";
	}
}
