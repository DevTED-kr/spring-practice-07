package com.nouvolution.testController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	public static final Logger loggger = LoggerFactory.getLogger(RedirectController.class);
	
	@RequestMapping("/doE")
	private String doE(RedirectAttributes redirectAttributes) {
		loggger.info("/doE called  and  redirect to /doF ...");
		redirectAttributes.addAttribute("msg", "this is the message with redirect");
		// TODO Auto-generated method stub
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF")
	private void doF(@ModelAttribute String msg) { 
		// TODO Auto-generated method stub
		loggger.info("redirect /doF" + msg );
	}
	
}
