package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class TC_LogINTest_003 extends BaseClass{
	public LoginPage lp;
	
	@Test(priority = 1) 
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2) 
	public void test2() {
		lp = new LoginPage(driver);
		lp.logInCredentials("kundadantikurhe1005@gmail.com", "Test@123");	
		lp.logInButton();
	}
	
	@Test(priority = 3) 
	public void test3() {
		lp =new LoginPage(driver);
		String actualUserId = lp.accountVerify();
		System.out.println("actual user id  = " + actualUserId); 
		String expectedUserId = "kundadantikurhe1005@gmail.com";
		System.out.println("actual user id  = " + expectedUserId); 

		Assert.assertEquals(actualUserId, expectedUserId);
	}
}
