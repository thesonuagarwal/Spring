package com.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

import com.boot.controller.HomeController;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DasBootApplicationTests {

	@Test
	public void testDasBootApplication() {
		HomeController hc = new HomeController();
		String result = hc.Home();
		assertEquals(result, "Das Boot, reporting for duty");
	}

}
