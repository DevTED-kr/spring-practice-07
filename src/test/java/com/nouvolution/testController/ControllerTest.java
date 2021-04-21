package com.nouvolution.testController;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ControllerTest {
	public static final Logger logger = LoggerFactory.getLogger(RedirectController.class);
	
	@Inject
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
		logger.info("setup ... ");
	}
	
	@Test
	public void testDoA() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(MockMvcRequestBuilders.get("/doA"))
				.andDo(print())
				.andExpect(status().isOk());

	}
	
	@Test
	public void testDoB() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(MockMvcRequestBuilders.get("/doB"))
				.andDo(print())
				.andExpect(status().isOk());

	}
	
	@Test
	public void testDoC() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(MockMvcRequestBuilders.get("/doC?msg=world"))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void testDoD() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(MockMvcRequestBuilders.get("/doD"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(model().attributeExists("productVO"));
	}
	
	@Test
	public void testDoE() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(MockMvcRequestBuilders.get("/doE"))
				.andDo(print())
				.andExpect(status().is3xxRedirection())
				.andExpect(model().attributeExists("/doF?msg=this+message+with+redirect"));
	}
	
	
}
