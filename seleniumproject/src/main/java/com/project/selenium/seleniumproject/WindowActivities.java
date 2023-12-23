package com.project.selenium.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize();
		driver.get("http://google.com");
		driver.navigate().to("https://itihasehind.quora.com/What-is-the-meaning-of-Chatrapati-Shivaji-Maharajs-Rajmudra");
		driver.navigate().back(); 
		driver.navigate().forward();
	}

}
