package com.jenkinexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

	@GetMapping("/home")
	public ModelAndView homePage(ModelAndView model) {
		System.out.println("this is my home page.");
		model.setViewName("home1");
		return model;
	}
}
