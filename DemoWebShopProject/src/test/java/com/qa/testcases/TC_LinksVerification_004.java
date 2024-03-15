package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_LinksVerification_004 extends BaseClass {
	HomePage hp ;
	
	@Test(priority = 1) 
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		hp = new HomePage(driver);
		hp.verifyLink();
		
		int expectedLinks = 95;
		System.out.println("expected Links = " +expectedLinks) ;
		int actualLinks = hp.linksCount();
		System.out.println("actual Links = " +actualLinks) ;
		
		Assert.assertEquals(actualLinks, expectedLinks);
	}
	
	@Test(priority = 3)
	public void test3() {
		hp = new HomePage(driver);
		int display =  hp.displayLinks();
		System.out.println("the display links counts = " + display);
	}
}
