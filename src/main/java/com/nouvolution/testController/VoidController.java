package com.nouvolution.testController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VoidController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/doA")
	public void doA(){
		logger.info("/doA called...");
	}
	
	@RequestMapping("/doB")
	public void doB(){
		logger.info("/doB called...");
	}
	
}
