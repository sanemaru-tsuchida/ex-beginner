package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.From.Exam2;



@Controller
@RequestMapping("/ex2")
public class Exam02Controller {
	@ModelAttribute
	public Exam2 setUpForm() {
		return new Exam2();
	}
	@Autowired
	private HttpSession session;
	@RequestMapping("")
	public String idex2() {
		return "exam02";
	}
	@RequestMapping("/input")
	public String index3(Exam2 exam2) {
		Integer num1 = Integer.parseInt(exam2.getNum1());
		Integer num2 = Integer.parseInt(exam2.getNum2());
		Integer answer = num1 + num2;
		session.setAttribute("ansewer", answer);
		session.setAttribute("exam2", exam2);
		return "exam02-result";
	}
	@RequestMapping("/to-page2")
	public String idex4() {
		return "exam02-result2";
	}
}
