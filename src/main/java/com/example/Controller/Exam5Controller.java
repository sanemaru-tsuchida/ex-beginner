package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Repository.MemberRepository;


@Controller
@RequestMapping("/ex5")
public class Exam5Controller {
	@Autowired
	private MemberRepository repository;
	
	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	@RequestMapping("/input")
	public String index3(String name,Model model) {
		model.addAttribute("menber",repository.findAll(name));
		return "exam05-result";
	}
}
