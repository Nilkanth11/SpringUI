package com.qa.SprintAuto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.SprintAuto.utils.PropertiesUtils;

@SpringBootTest
class SprintAutoApplicationTests {

	@Autowired
	private PropertiesUtils properties;

	@Test
	void contextLoads() {

		/*
		 * HomePage page = new HomePage(); LoginPage lpage = page.clickLogin();
		 * lpage.doLogin("admin", "admin@pass"); lpage.doClick();
		 */
		properties.addProperty("hey", "hello");
		
		System.out.println(properties.getProperty("hey"));
	}

}
