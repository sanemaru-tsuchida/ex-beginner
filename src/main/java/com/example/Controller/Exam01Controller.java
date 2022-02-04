package com.example.Controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.From.Exam1;



@Controller
@RequestMapping("/ex1")
public class Exam01Controller {
	@ModelAttribute
	public Exam1 index2() {
		return new Exam1();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	@RequestMapping("/input")
	public String idex(Exam1 exam1,Model model) {
		model.addAttribute("name", exam1.getName());
		return "exam01-result";
	}
	
}
