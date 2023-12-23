package com.add.items.ecommerce.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//expected
		String[] itemsNeeded = {"Brocolli", "Beetroot", "Cucumber"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		
		
	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{	
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)
		{
			// Brocolli - 1 Kg
			
			String[] name = products.get(i).getText().split("-");
			String formattedItems = name[0].trim();
			
			//format it to get actual vegetable name
			//check whether name you expect6ed is present in arrayList or not
			//convert array into array list for easy search
			
			List itemsNeededList  = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList .contains(formattedItems))
			{
				j++;
				//click on Add to cart
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		
		}
	}
}
