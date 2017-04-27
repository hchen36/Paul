package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {
	@RequestMapping("/")
	public String login(Model model){
		model.addAttribute("message","hello");
		System.out.println("login in success");
		return "helloWorld";
	}
}
