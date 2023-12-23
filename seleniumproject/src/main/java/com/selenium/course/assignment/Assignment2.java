package com.selenium.course.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.findElement(By.name("name")).sendKeys("Veeren");
	driver.findElement(By.name("email")).sendKeys("veeren@123.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("987456321");
	driver.findElement(By.id("exampleCheck1")).click();
	WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	Select selectdropdown  = new Select(dropdown);
	selectdropdown .selectByVisibleText("Female");
	driver.findElement(By.id("inlineRadio2")).click();
	driver.findElement(By.name("bday")).sendKeys("01/09/2023");
	driver.findElement(By.cssSelector(".btn-success")).click();
	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}
}