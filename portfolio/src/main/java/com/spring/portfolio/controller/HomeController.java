package com.spring.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "", "/home" })
	public String showHomePage(Model model) {
		model.addAttribute("title", "Home");
		return "master";
	}
	
	@GetMapping({ "/about" })
	public String showAboutPage(Model model) {
		model.addAttribute("title", "About");
		return "master";
	}

	@GetMapping("/projects")
	public String showProjectsPage(Model model) {
		model.addAttribute("title", "Projects");
		return "master";
	}
	
	@GetMapping("/career-overview")
	public String showResumePage(Model model) {
		model.addAttribute("title", "Career Overview");
		return "master";
	}
	
	@GetMapping("/contact")
	public String showContactPage(Model model) {
		model.addAttribute("title", "Contact");
		return "master";
	}

}