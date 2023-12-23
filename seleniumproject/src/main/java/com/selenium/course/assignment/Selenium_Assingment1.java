package com.selenium.course.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Assingment1 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	//	driver.manage().window().maximize();

	//	driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		String selectedString=driver.findElement(By.xpath("//label[@for='india']")).getText();
		System.out.println("Text from the Check Box :"+selectedString);
		WebElement dropSelect = driver.findElement(By.xpath("//select[@id='autocomplete']"));
		Select dSelect = new Select(dropSelect);
		dSelect.selectByVisibleText(selectedString);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(selectedString);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert popAlert=driver.switchTo().alert();
		String alertText=popAlert.getText();
		System.out.println("Complete Message from Popup Before Trimming : "+alertText);
		String alertTrimText = alertText.split(",")[0].trim().split(" ")[1];
		System.out.println("Text after trimming the Popup Message : "+alertTrimText);

		String eText = "India";
		if(alertTrimText.contentEquals(eText)){
			System.out.println("Test Passed");
		}
	}
}
