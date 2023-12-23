package com.project.selenium.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// testNG is one of the testing framework

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//drop-down with select tag - static
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.id("hrefIncAdt")).click();

		//Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);


		//		int i=1;
		//		while(i<5)
		//		{
		//			driver.findElement(By.id("hrefIncAdt")).click();
		//			i++;
		//		}

		//		for(int i =1;i<5;i++)
		//		{
		//			driver.findElement(By.id("hrefIncAdt")).click();
		//			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//
		//		}
		//		driver.findElement(By.id("btnclosepaxoption")).click(); 

		//	driver.get("http://spicejet.com"); //URL in the browser
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date1")).isEnabled());

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its Enabled");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		
	}
}
