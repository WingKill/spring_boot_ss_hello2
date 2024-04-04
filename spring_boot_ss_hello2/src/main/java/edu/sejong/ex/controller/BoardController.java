package edu.sejong.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.sejong.ex.vo.Grade;
import edu.sejong.ex.vo.Rectangle;

@Controller
public class BoardController {
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board() {
		System.out.println("board()..");
		
		return "board";
	}
	
	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public String view() {
		System.out.println("view()..");
		
		return "board/view";
	}

//	@RequestMapping(value = "/board/content")
//	public String content() {
//		System.out.println("content()..");
//		
//		return "board/content";
//	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		System.out.println("reply()..");
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		
		return mv;			
	}
	
//	@RequestMapping("/board/reply")
//	public ModelAndView reply(ModelAndView mv) {
//		System.out.println("reply()..");
//		mv.addObject("id",30);
//		mv.setViewName("board/reply");
//		
//		return mv;			
//	}
	
	@RequestMapping("/board/content")
	public void content(Model model, Locale locale) {
		System.out.println("content()..");
		
		model.addAttribute("id", 30);
		model.addAttribute("age", 30); 
		model.addAttribute("name", "홍길동");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
	}

	
// view에 전달하는 방식은 다양하다.
	
//	@RequestMapping("/board/grade")
//	public ModelAndView grade(ModelAndView mv, Grade grade) {
//		System.out.println("grade()..");
//		grade.setKor(80);
//		grade.setEng(70);
//		grade.setMath(80);
//		
//		mv.addObject("grade", grade);				
//		return mv;
//	}
	
//	@RequestMapping("/board/grade")
//	public void grade(Model model) {
//		System.out.println("grade()..");
//		Grade grade = new Grade(80,70,80);		
//		model.addAttribute("grade", grade);
//	}
	
	@RequestMapping("/board/grade")
	public String grade(Model model) {
		System.out.println("grade()..");
		Grade grade = new Grade(80,70,80);		
		model.addAttribute("grade", grade);
		return "board/grade";
	}
	
//	@RequestMapping("/board/rectangle")
//	public void rectangle(Model model) {
//		Rectangle rectangle = new Rectangle(80,70);
//		model.addAttribute("rectangle", rectangle);
//	}
	
	@RequestMapping("/board/rectangle")
	public void rectangle(Model model, Rectangle rectangle) {
		rectangle.setWidth(80);
		rectangle.setHeight(70);
		model.addAttribute("rectangle", rectangle);
	}
}
