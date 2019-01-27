package com.abc.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.abc.RestPatientApplicationTests;

public class TestWebApp extends RestPatientApplicationTests  {
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void getPatientsTest() throws Exception {
		
		mockMvc.perform(get("/patientmgt/patients")).andExpect(status().isOk());
		                                             /*.andExpect(content().contentType("application/xml;charset=UTF-8"))
		                                             .andExpect(jsonPath("$.patientId").value(1))
		                                             .andExpect(jsonPath("$.patientName").value("Amdad")).andExpect(jsonPath("$.patientAddress").value("omaha"))
		                             				.andExpect(jsonPath("$.patientAge").value(30)).andExpect(jsonPath("$.patientContactNumber").value("123-456-7890"))
		                             				.andExpect(jsonPath("$.patientEmail").value("abc@xyz.com"));
		*/
	}

}
