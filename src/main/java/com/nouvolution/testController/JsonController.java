package com.nouvolution.testController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nouvolution.testControllerDTO.ProductVO;

@Controller
public class JsonController {

//	public static final Logger logger = LoggerFactory.getLogger(RedirectController.class);
	
	@RequestMapping("/doJson")
	@ResponseBody
	private ProductVO doJson() {
		// TODO Auto-generated method stub
		
		ProductVO productVO = new ProductVO("laptop", 300000);
		
		return productVO;

	}
}
