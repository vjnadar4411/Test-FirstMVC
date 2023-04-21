package com.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/Welcome")
	ModelAndView getWelcomeMessage() {
		
		ModelAndView mav =  new ModelAndView();
		
		mav.addObject("msg", "Hello All...");
		mav.setViewName("index");		
		
		return mav;
	}

}
