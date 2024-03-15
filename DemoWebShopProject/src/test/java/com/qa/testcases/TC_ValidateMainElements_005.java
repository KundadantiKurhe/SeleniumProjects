package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_ValidateMainElements_005 extends BaseClass {
	HomePage hp ;
	
	@Test(priority = 1) 
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	} 
	
	@Test(priority = 2)
	public void test2() {
		hp = new HomePage(driver);
		hp.validateTexts();
	}
	
	@Test(priority = 3)
	 public void test3() {
		 int expect = 7;
		 int actual = hp.elementsCounts();

		Assert.assertEquals(actual, expect);
	 }
}
