package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void setUp() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	
	
}
