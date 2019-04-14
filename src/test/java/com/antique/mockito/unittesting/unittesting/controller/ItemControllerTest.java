package com.antique.mockito.unittesting.unittesting.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@RunWith(SpringRunner.class)
@WebMvcTest(ItemsController.class)
public class ItemControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void helloWorld_basic() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/dummy-items").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"quantity\": 100,\"price\":10,\"name\":\"Ball\"}"))
//				.andExpect(content().string("{\"quantity\":100,\"price\":10,\"name\":\"Ball\",\"id\":1}"))
				.andReturn();
//		assertEquals("{\"quantity\":100,\"price\":10,\"name\":\"Ball\",\"id\":1}", result.getResponse().getContentAsString());
	}

}
