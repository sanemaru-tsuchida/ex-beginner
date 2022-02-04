package com.example.Controller;

import java.text.NumberFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.From.Exam3;

import jakarta.servlet.ServletContext;


@Controller
@RequestMapping("/ex3")
public class Exam03Controller {
	@ModelAttribute
	public Exam3 setUpForm() {
		return new Exam3();
	}
	@Autowired
	private ServletContext application;
	@RequestMapping("")
	public String idex2() {
		return "exam03";
	}
	@RequestMapping("/input")
	public String index3(Exam3 exam3) {
		NumberFormat comFormat = NumberFormat.getNumberInstance(); 
		Integer num1 = Integer.parseInt(exam3.getNum1());
		Integer num2 = Integer.parseInt(exam3.getNum2());
		Integer num3 = Integer.parseInt(exam3.getNum3());
		int answer = num1 + num2 + num3;
		
		double tax = answer * 0.1;
		int answerTax = answer + (int)tax;
		application.setAttribute("ansewer",comFormat.format(answer));
		application.setAttribute("answerTax",comFormat.format(answerTax));
		return "exam03-result";
	}
	
}
