package com.nouvolution.testController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StringController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/doC")
	private String doC(@ModelAttribute("msg") String msg) {
		// TODO Auto-generated method stub
		logger.info("/doC called ... ");
		return "result";
	}
}
