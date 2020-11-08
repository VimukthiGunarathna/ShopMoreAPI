package com.shopmore;

import com.shopmore.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ShopmoreApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private ProductService service;

	@Test
	void getAllProducts() {
		Assert.notEmpty(service.getAllProducts());
	}
	@Test
	void getAllCartonPrices() {
		Assert.notEmpty(service.getAllCartonPrices());
	}
	@Test
	void getAllPricing() {
		Assert.notEmpty(service.getAllPricing());
	}

}
