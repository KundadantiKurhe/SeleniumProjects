package com.java.realtime;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gi-de.com/en/");
		System.out.println(driver.findElement(By.name("txtName")));
		System.out.println(driver.findElement(By.tagName("a")).getSize());

		WebElement footerDriver = driver.findElement(By.id("test"));
		System.out.println(footerDriver.findElement(By.tagName("a")).getSize());
		
	//	footerDriver.findElement(By.xpath("inline-list payment-icons"));
			
			WebElement coloumndriver = footerDriver.findElement(By.xpath("//div/ul/li[1]/a"));
			System.out.println(coloumndriver.findElement(By.tagName("a")).getSize());
			//4- click on each link in the coloumn and check if the pages are opening-
			for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
			{
				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				Thread.sleep(5000L);
			}// opens all the tabs
			
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();

			while(it.hasNext())
			{
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
			}
	}

}
