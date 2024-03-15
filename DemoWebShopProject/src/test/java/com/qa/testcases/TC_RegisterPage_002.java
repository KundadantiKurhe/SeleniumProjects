package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistationPage;

public class TC_RegisterPage_002 extends BaseClass {

	@Test(priority = 1) 
	public void test1()
	{
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}

	@Test(priority = 2) 
	public void test2() {
		RegistationPage rp = new RegistationPage(driver);
		rp.registerUser("Kundadanti", "Kurhe", "kundadantikurhe10@gmail.com");
		rp.userPassword("Test@123", "Test@123");
		rp.confirmRegister();
	}

	@Test(priority = 3)
	public void testUserVerify() {
		RegistationPage rp = new RegistationPage(driver);
		String actualUser = rp.user();
		System.out.println("Actual user name is = " + actualUser);
		String expectUser = "kundadantikurhe10@gmail.com";
		System.out.println("expected user name is = " + expectUser);
		Assert.assertEquals(actualUser, expectUser);
	}
}
