package com.project.selenium.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown=driver.findElement(By.id("checkBoxOption3"));

		Select s=new Select(dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();

		String text=  driver.switchTo().alert().getText();

		if(text.contains(opt)){
			System.out.println("Alert message success");
		}else
			System.out.println("Something wrong with execution");
	}
	//  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());  
}
