package com.project.selenium.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstProject {

	public static void main(String[] args) {

		//Invoking browser 
		//Chrome - ChromeDriver extn - methods close get
		//Firefox - FirefoxDriver - methods close get
		//safari - Safarodriver - methods close get
		//WebDriver methods - class methods
		
		//chromedriver.exe - Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		
		//webdriver.chrome.driver - value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk17-windows");
		System.out.println (driver.getTitle());
		System.out.println (driver.getCurrentUrl());
		
		//Firefox Launch
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://github.com/mozilla/geckodriver/releases");
		System.out.println (driver1.getCurrentUrl());
	
//		drier.close();
//		driver.quit();
	//	driver1.quit();
		
		
	}

}
