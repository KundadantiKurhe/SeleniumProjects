package com.project.selenium.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {
	public static void main(String[] args) throws InterruptedException {

		//Implicit wait-5seconds time out
		    
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		//webdriver.chrome.driver - value of path
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get("https://rahulshettyacademy.com/practice-project");
		 * //driver.findElement(By.id("usernameField")).sendKeys("KaVeri"); //
		 * driver.findElement(By.id("email")).sendKeys("Kundadantikurhe"); //
		 * driver.findElement(By.name("name")).sendKeys("Kundadanti");
		 * driver.findElement(By.className("btn-primary20")).click();
		 * System.out.println(driver.findElement(By.cssSelector("inline-error"))); //
		 * driver.findElement(By.linkText("Forgot Password")).click();
		 * driver.findElement(By.xpath("//input[@placeholder='Your Name*'")).sendKeys(
		 * "John"); //
		 * driver.findElement(By.cssSelector("input[placeholder='email'")).sendKeys(
		 * "kundadantikurhe1005"); //
		 * driver.findElement(By.cssSelector("//input[@type='email'[2]")).clear();
		 * driver.findElement(By.cssSelector("//input='text'[2]")).sendKeys("john@1223")
		 * ; driver.findElement(By.xpath("//form/input[2]")).sendKeys("fgh");
		 */    


		//implicit wait - 2 seconds time out

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		}
}
