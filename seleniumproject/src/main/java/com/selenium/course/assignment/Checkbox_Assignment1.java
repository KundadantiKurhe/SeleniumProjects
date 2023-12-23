package com.selenium.course.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
		
		System.out.println(driver.findElements(By.cssSelector("input[value='option1']")).size());

		driver.findElements(By.cssSelector("input[value='option1']")).size();
	}

}
