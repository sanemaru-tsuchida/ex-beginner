package com.example.Controller;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.From.UserFrom;
import com.example.domain.User;

@Controller
@RequestMapping("/ex4")
public class Exam04Controller {
	@ModelAttribute
	public UserFrom index() {
		return new UserFrom();
	}
	@RequestMapping("")
	public String index2() {
		return "exam04";
	}
	@RequestMapping("/input")
	public String idenx3(@Validated UserFrom from,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return index2();
		}
		User user =new User();
		BeanUtils.copyProperties(from,user);
		model.addAttribute("user", user);
		return "exam04-result";
		
	}
}
