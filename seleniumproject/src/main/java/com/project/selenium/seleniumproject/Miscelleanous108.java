package com.project.selenium.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous108 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().deleteCookieNamed("sessionKey");
		// session 
		
		
		//Check the scenario where they want to delete the session cookie and make that secure
		// and make sure that secure login gets logouts and he has to navigate to the home page
		// how do you automate that?
		
		
		//click on aNY LINK 
		//LOGHIN PAGE - VERIFY LOGIN URL
		
		
		
		///driver.manage();

		driver.get("https://google.com");

		
	}

}
