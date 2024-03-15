package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TC_linkTest_001 extends BaseClass {
	
	@Test
	public void linkTest() {
		driver.get("http://demowebshop.tricentis.com");
	}
}