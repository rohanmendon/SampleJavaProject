package com.mycompany.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "Hello World, Spring MVC Tutorial";
		ModelAndView mav = new ModelAndView("welcome1");
		
		Map<String, String> modelMap = new HashMap<String, String>();
		modelMap.put("message", message);
		mav.addAllObjects(modelMap);
		return mav;
	}
}
