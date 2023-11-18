package com.example.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class  OrderServiceApplicationTests extends AbstractContainerBaseTest{


	private MockMvc mockMvc;
	private ObjectMapper objectMapper;
	private final String TEST_SKU_CODE = "testSkuCode";




	@Test
	void contextLoads() {
	}

}
