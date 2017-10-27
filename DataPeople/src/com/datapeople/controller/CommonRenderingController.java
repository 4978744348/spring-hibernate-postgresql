package com.datapeople.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonRenderingController {
	
	@RequestMapping("/Home.spr")
	public ModelAndView goHome() {
		return new ModelAndView("home");
	}

}
